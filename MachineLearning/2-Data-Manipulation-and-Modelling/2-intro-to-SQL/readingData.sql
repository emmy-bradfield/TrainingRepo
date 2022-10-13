use introToSQL;

SELECT * FROM people;
SELECT city FROM people;
SELECT * FROM people WHERE surname = 'Bradfield';

SELECT *
FROM people
GROUP BY surname;