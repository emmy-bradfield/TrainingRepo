-- SCRIPT FOR SAKILA CHALLENGE TASKS --
USE sakila;
DROP VIEW IF EXISTS task_01, task_02, task_03, task_04, task_05, task_06, task_07, task_08, task_09,
task_10, task_11, task_12, task_13, task_14, task_15, task_16, v_task_16, task_17, task_18, task_19,
v_task_19, task_20, task_21, v_task_21, task_22, task_23, task_24, task_25;

-- TASK ONE: 
-- List all actors

CREATE VIEW task_01
AS
	SELECT first_name AS 'First Name', last_name 'Last Name'
    FROM actor
;

-- TASK TWO
-- Find the surname of the actor with the forename 'John'.

CREATE VIEW task_02
AS
	SELECT last_name AS 'Surname\'s of Johns'
    FROM actor
    WHERE first_name='John'
;

-- TASK THREE
-- Find all actors with surname 'Neeson'

CREATE VIEW task_03
AS
	SELECT first_name AS 'First Names', last_name AS 'Confirmation of surname'
    FROM actor
    WHERE last_name='Neeson'
;

-- TASK FOUR
-- Find all actors with ID numbers divisible by 10

CREATE VIEW task_04
AS
	SELECT first_name AS 'First Name', last_name AS 'Surname', actor_id AS 'IDs divisible by 10'
    FROM actor
    WHERE actor_id%10=0
;

-- TASK FIVE
-- What is the description of the movie with an ID of 100?

CREATE VIEW task_05
AS
	SELECT film_id AS 'Film ID confirmation', title AS 'Title of movie 100', `description` AS 'Description of movie 100'
    FROM film
    WHERE film_id = 100
;

-- TASK SIX
-- Find every R-rated movie

CREATE VIEW task_06
AS
	SELECT title AS 'Movies rated R', rating AS 'Rating confirmation'
    FROM film
    WHERE rating = 'r'
;

-- TASK SEVEN
-- Find every non-R-rated movie

CREATE VIEW task_07
AS
	SELECT title 'Movies NOT rated R', rating AS 'Rating'
    FROM film 
    WHERE rating != 'r'
;

-- TASK EIGHT
-- Find the ten shortest movies

CREATE VIEW task_08
AS
	SELECT title AS '10 Shortest Movies', length AS 'Runtime'
    FROM film 
    ORDER BY length ASC
    LIMIT 10
;

-- TASK NINE
-- Find the movies with the longest runtime, without using LIMIT

CREATE VIEW task_09
AS
	SELECT Title AS 'Movie Name', Length AS 'Duration'
	FROM film
	WHERE length IN (
		SELECT MAX(length) 
		FROM film
    )
;


-- TASK TEN
-- Find all movies that have deleted scenes

CREATE VIEW task_10
AS
	SELECT title AS 'Movies with deleted scenes', special_features AS 'Special features description'
    FROM film
    WHERE special_features LIKE '%Deleted Scenes%'
;

-- TASK 11
-- Using HAVING, reverse-alphabetically list the last names that are not repeated

CREATE VIEW task_11
AS
    SELECT last_name AS 'Unique surnames', count(last_name) AS surname_count
	FROM actor 
	GROUP BY last_name
    HAVING surname_count < 2
    ORDER BY last_name DESC
;

-- TASK 12
-- Using HAVING, list the last names that appear more than once, from highest to lowest frequency

CREATE VIEW task_12
AS
	SELECT last_name 'Repeated Surnames', count(last_name) AS surname_count
    FROM actor
    GROUP BY last_name
    HAVING surname_count > 1
    ORDER BY surname_count DESC
;

-- TASK 13
-- Which actor has appeared in the most films?

CREATE VIEW task_13
AS
	SELECT actor.first_name AS 'First Name', actor.last_name AS 'Surname', 
    COUNT(film_actor.actor_id) AS total_films
    FROM film_actor
    JOIN actor ON film_actor.actor_id=actor.actor_id
    GROUP BY film_actor.actor_id
    ORDER BY total_films DESC LIMIT 1
;

-- TASK 14
-- When is 'Academy Dinosaur' due?

CREATE VIEW task_14
AS
	SELECT film.title AS 'Movie Title', rental.return_date AS 'Rental return due'
    FROM rental
    JOIN film ON film.film_id=rental.rental_id
    WHERE film.title = 'Academy Dinosaur'
;

-- TASK 15
-- What is the average runtime of all films?

CREATE VIEW task_15
AS
	SELECT AVG(length) AS 'Average runime of all films'
    FROM film
;

-- TASK 16
-- List the average runtime for every film category

CREATE VIEW v_task_16
AS 
	SELECT AVG(film.length) AS runtime, film_category.category_id AS category_id
    FROM film 
    JOIN film_category ON film.film_id=film_category.film_id
    GROUP BY film_category.category_id
;

CREATE VIEW task_16
AS
	SELECT c.`name` AS 'Genre', v.runtime AS 'Average film runtime for genre'
    FROM v_task_16 v
    JOIN category c ON c.category_id=v.category_id
;

-- TASK 17
-- List all movies featuring a robot

CREATE VIEW task_17
AS
	SELECT title AS 'Movie name', `description` AS 'Full description, evidencing robot is present'
    FROM film
    WHERE `description` LIKE '%robot%'
;

-- TASK 18
-- How many movies were released in 2010?

CREATE VIEW task_18
AS
	SELECT count(film_id) AS 'Films released in 2010'
    FROM film
    WHERE release_year = 2010
;

-- TASK 19
-- Find the titles of all the horror movies

CREATE VIEW v_task_19
AS
	SELECT f.title, c.category_id
    FROM film f
    JOIN film_category c ON f.film_id=c.film_id
;

CREATE VIEW task_19
AS
	SELECT v.title AS 'Movie name', c.`name` AS 'Confirmation of genre'
    FROM v_task_19 v
    JOIN category c ON v.category_id=c.category_id
    WHERE c.`name` = 'Horror'
;

-- TASK 20
-- List the full name of the staff member with the ID of 2

CREATE VIEW task_20
AS
	SELECT staff_id AS 'Confirmation of ID', first_name AS 'First Name', last_name AS 'Surname'
    FROM staff
    WHERE staff_id = 2
;

-- TASK 21
-- List all the movies that Fred Costner has appeared in

CREATE VIEW v_task_21
AS
	SELECT f.film_id, a.first_name, a.last_name
    FROM actor a
    JOIN film_actor f ON f.actor_id=a.actor_id
    WHERE first_name = 'Fred' AND last_name = 'Costner'
;

CREATE VIEW task_21
AS
	SELECT f.title AS 'Movies with Fred Costner'
    FROM film f
    JOIN v_task_21 v ON v.film_id=f.film_id
;

-- TASK 22
-- How many distinct countries are there?

CREATE VIEW task_22
AS
	SELECT COUNT(DISTINCT country_id) AS 'Total number of distinct countries'
    FROM country
;

-- TASK 23
-- List the name of every language in reverse-alphabetical order

CREATE VIEW task_23
AS
	SELECT `name` AS 'All languages'
    FROM `language`
    ORDER BY `name` DESC
;

-- TASK 24
-- List the full names of every actor whose surname ends with '-son' in alphabetical order by their forename

CREATE VIEW task_24
AS
	SELECT first_name AS 'First name', last_name AS 'Surnames ending with -son'
    FROM actor
    WHERE last_name LIKE '%son'
;

-- TASK 25
-- Which category contains the most films?

CREATE VIEW task_25
AS
	SELECT c.`name` AS 'Genre', COUNT(f.category_id) AS 'Total films'
    FROM film_category f
    JOIN category c ON f.category_id=c.category_id
    GROUP BY f.category_id
    ORDER BY COUNT(category_id) DESC LIMIT 1
;

-- END OF SAKILA CHALLENGE SCRIPT --

SELECT * FROM task_01;
SELECT * FROM task_02;
SELECT * FROM task_03;
SELECT * FROM task_04;
SELECT * FROM task_05;
SELECT * FROM task_06;
SELECT * FROM task_07;
SELECT * FROM task_08;
SELECT * FROM task_09;
SELECT * FROM task_10;
SELECT * FROM task_11;
SELECT * FROM task_12;
SELECT * FROM task_13;
SELECT * FROM task_14;
SELECT * FROM task_15;
SELECT * FROM task_16;
SELECT * FROM task_17;
SELECT * FROM task_18;
SELECT * FROM task_19;
SELECT * FROM task_20;
SELECT * FROM task_21;
SELECT * FROM task_22;
SELECT * FROM task_23;
SELECT * FROM task_24;
SELECT * FROM task_25;

-- END OF FILE -- 