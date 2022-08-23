# NOT WORKING DUE TO LACK OF CREDS DUE TO VIRTUAL IDE CODE IS TAKEN FROM. DISPLAYS METHOD

# import the required libraries
import re
import requests
import mysql.connector
import boto3

# Use AWS boto3 sdk to retreive RDS MySQL database endpoint
rds_client = boto3.client('rds', region_name='us-west-2')
response = rds_client.describe_db_instances()
endpoint = response['DBInstances'][0]['Endpoint']['Address']

db = mysql.connector.connect(
  host=endpoint,
  user="admin",
  passwd="demotest123"
)

cursor = db.cursor()

# create database
cursor.execute('DROP DATABASE IF EXISTS book_catalog')
cursor.execute('CREATE DATABASE IF NOT EXISTS book_catalog')
cursor.execute('USE book_catalog')

# create tables
cursor.execute('''
CREATE TABLE IF NOT EXISTS books (
    isbn VARCHAR(13) PRIMARY KEY,
    title TEXT NOT NULL,
    subtitle TEXT DEFAULT NULL,
    no_pages INT DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
''')

cursor.execute('''
CREATE TABLE IF NOT EXISTS authors (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
''')

cursor.execute('''
CREATE TABLE IF NOT EXISTS themes(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name TEXT NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8
''')

cursor.execute('''
CREATE TABLE IF NOT EXISTS authors_books (
    isbn VARCHAR(13),
    author_id INT,
    PRIMARY KEY (isbn, author_id),
    FOREIGN KEY (isbn) REFERENCES books(isbn),
    FOREIGN KEY (author_id) REFERENCES authors(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
''')

cursor.execute('''
CREATE TABLE IF NOT EXISTS books_themes (
    isbn VARCHAR(13),
    theme_id INT,
    PRIMARY KEY (isbn, theme_id),
    FOREIGN KEY (isbn) REFERENCES books(isbn),
    FOREIGN KEY (theme_id) REFERENCES themes(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
''')
db.commit()
cursor.close()

# the base URL to query the books API
API_URL = 'http://openlibrary.org/api/books'

# a list of ISBNs to be added to the catalog
isbn_list = [
    '978-0201853926',
    '0201558025',
    '978-1-93435-645-6',
    '9780199218462',
    '978-4915512377',
    '1593278551',
    '0811862151',
    '9780761174707',
    '1844834115',
    '9781408845646',
    '9780201896831',
    '0321534964',
    '1408855895',
    '0590353403',
]

# cycle through the list and query the API
for isbn in isbn_list:
    # grab a fresh cursor
    cursor = db.cursor()

    # set up proper search parameters for the API
    isbn_payload = 'ISBN:%s' % isbn

    # set all parameters needed to make the request
    params = {
        'bibkeys':isbn_payload,
        'format':'json',
        'jscmd':'data'
    }

    # send the request
    r = requests.get(API_URL, params)
    
        # retreive the book from the JSON data
    book = r.json()[isbn_payload]

    # obtain all information we require to put into our database
    title = book['title']
    subtitle = book['subtitle'] if 'subtitle' in book else ''
    no_pages = book['number_of_pages'] if 'number_of_pages' in book else 0
    authors = [auth['name'] for auth in book['authors']]
    themes = [subj['name'] for subj in book['subjects']] if 'subjects' in book else []

    # clean up ISBN from input (numbers only to fit the VARCHAR(13) limit)
    isbn_clean = re.sub('[^0-9]', '', isbn)
    
     # insert data into database

    # insert book
    insert_book_stmt = 'INSERT INTO books(isbn, title, subtitle, no_pages) VALUES( %s, %s, %s, %s )'
    cursor.execute(insert_book_stmt, (isbn_clean, title, subtitle, no_pages))
    
     # insert authors
    # check if author exists in DB otherwise create and retreive the ID
    insert_author_stmt = 'INSERT INTO authors(name) VALUES(%(name)s)'
    insert_authors_books_stmt = 'INSERT INTO authors_books VALUES (%s, %s)'
    for author in authors:
        select_author_id_stmt = 'SELECT id FROM authors WHERE name = "{}"'.format(author)
        cursor.execute(select_author_id_stmt)
        result = cursor.fetchone()

        if result is None:
            cursor.execute(insert_author_stmt, {'name':author})
            author_id = cursor.lastrowid
        else:
            author_id = result[0]

        # insert author_id into authors_books
        cursor.execute(insert_authors_books_stmt, (isbn_clean, author_id))
        
         # insert themes
    # check if theme exists in DB otherwise create and retreive the ID
    insert_theme_stmt = 'INSERT INTO themes(name) VALUES(%(name)s)'
    insert_books_themes_stmt = 'INSERT INTO books_themes VALUES (%s, %s)'
    for theme in themes:
        select_theme_id_stmt = 'SELECT id FROM themes WHERE name = "{}"'.format(theme)
        cursor.execute(select_theme_id_stmt)
        result = cursor.fetchone()

        if result is None:
            cursor.execute(insert_theme_stmt, {'name':theme})
            theme_id = cursor.lastrowid
        else:
            theme_id = result[0]

        # insert theme_id into books_themes
        cursor.execute(insert_books_themes_stmt, (isbn_clean, theme_id))
        
        db.commit()
        cursor.close()