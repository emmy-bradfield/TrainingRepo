# Pythonic Iteration
import re


numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
squared = [x**2 for x in numbers]
print("Numbers: ", numbers)
print("Numbers Squared: ", squared)

# Types of array
personTuple = ('Emily', 'Bradield', 23)
personList = ['Emily', 'Bradfield', 23]
personDict = {"forename": "Emily", "surname": "Bradfield", "age": "23"}
print(f"Person as a tupple:\n{personTuple}\nPerson as a list:\n{personList}\nPerson as a dictionary:\n{personDict}")

# Unpacking
people =[
    ("Emily", "Bradfield", 23, "Tech Specialist", "South Tottenham"),
    ("James", "Bradfield", 20, "student", "Ealing"),
    ("Chloe", "Bush", 24, "Flight Attendant", "Brighton"),
    ("Hillary", "McEwan", 24, "Customs Import Specialist", "Dover")
]

for forename, surname, age, occupation, location in people:
    print(f"{forename} {surname} is a {age} year-old {occupation} in {location}")

def printPeople(forename, surname, age, occupation, location):
    print(f"{forename} {surname} is a {age} year-old {occupation} in {location}")

for person in people:
    printPeople(*person)

# Sorting
fruit = [
    "apple",
    "pear",
    "banana",
    "kiwi",
    "Orange",
    "Pomegranite",
    "BLUEBERRY",
    "StrawBerry",
    "APRICOT",
    "dragon Fruit"
]

print(f"Fruit (unsorted):\n{fruit}")

sorted_fruit = sorted(fruit)
print(f"Fruit (sorted, case-sensitive: \n{sorted_fruit}")

def ignore_case(item):
    return item.lower()

sorted_fruit_lc = sorted(fruit, key=ignore_case)
print(f"Fruit (sorted):\n{sorted_fruit_lc}")
print(" ".join(sorted_fruit_lc), end="\n\n")

nums = [800, 80, 1000, 32, 255, 400, 5, 5000]
print(f"{nums}\n")

n1 = sorted(nums)
print(f"{n1}\n")

n2 = sorted(nums, key=str)
print(f"{n2}\n")

# sorting books using a customer regex
books = [
    "The Adventures of Sherlock Holmes",
    "The Case-Book of Sherlock Holmes",
    "His Last Bow",
    "The Hound of Baskerville",
    "The Memoirs of Sherlock Holmes",
    "The Return of Sherlock Holmes",
    "The Sign of the Four",
    "A Study in Scarlet",
    "The Valley of Fear"
]

rx_article = re.compile(r'^(the|a|an)\s+', re.I)

def strip_articles(title):
    stripped_title = rx_article.sub('', title.lower())
    return stripped_title

for book in sorted(books, key=strip_articles):
    print(book)