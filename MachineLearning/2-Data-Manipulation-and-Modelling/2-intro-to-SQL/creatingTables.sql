CREATE DATABASE introToSQL;
use introToSQL;

DROP TABLE IF EXISTS people;
CREATE TABLE people (
    id INT NOT NULL AUTO_INCREMENT,
    forename VARCHAR(250) NOT NULL,
    surname VARCHAR(250) NOT NULL,
    date_of_birth DATE NOT NULL,
    city VARCHAR(250),
    PRIMARY KEY id
)

INSERT INTO people(forename, surname, date_of_birth, city) VALUES ('Emily', 'Bradfield', 1999-02-17, 'London')
INSERT INTO people(forename, surname, date_of_birth, city) VALUES ('James', 'Bradfield', 2001-09-27, 'London')