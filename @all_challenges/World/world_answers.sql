-- SCRIPT FOR WORLD CHALLENGE TASKS --
USE world;
DROP VIEW IF EXISTS task_01, task_02, task_03, task_04, task_05, task_06, task_07, task_08, task_09, task_10,
task_11, task_12, task_13, task_14, task_15, task_16, task_17, task_18, task_19, task_20;

-- TASK ONE
-- Using COUNT, get the number of cities in the USA

CREATE VIEW task_01
AS
	SELECT COUNT(ci.countryCode) AS 'Total Cities in the USA'
    FROM city ci
    JOIN country co ON co.code=ci.countryCode
    WHERE co.`name` = 'United States'
;

-- TASK TWO 
-- Find out the population and life expectancy for people in Argentina

CREATE VIEW task_02
AS
	SELECT population AS 'Population', lifeexpectancy AS 'Life Expectancy'
    FROM country
    WHERE `name` = 'Argentina'
;

-- TASK THREE
-- Using IS NOT NULL, ORDER BY, and LIMIT, which country has the highest life expectancy?

CREATE VIEW task_03
AS
	SELECT `name` AS 'Country', lifeexpectancy AS 'Life Expectancy'
    FROM country
    WHERE lifeexpectancy IS NOT NULL
    ORDER BY lifeexpectancy DESC LIMIT 1
;

-- TASK FOUR
-- Using JOIN ... ON, find the capital city of Spain

CREATE VIEW task_04
AS
	SELECT ci.`name` AS 'Capital of Spain'
    FROM city ci
    JOIN country co ON co.capital=ci.ID
    WHERE co.`name` = 'Spain'
;

-- TASK FIVE
-- Using JOIN ... ON, list all the languages spoken in the Southeast Asia region

CREATE VIEW task_05
AS
	SELECT l.`language` AS 'Languages Spoken in Southeastern Asia'
    FROM countrylanguage l
    JOIN country c ON c.code=l.countrycode
    WHERE c.region = 'Southeast Asia'
;

-- TASK SIX
-- Using a single query, list 25 cities around the world that start with the letter F

CREATE VIEW task_06
AS
	SELECT `name` AS '25 Countries whose Names Begin with the Letter F'
    FROM city
    WHERE `name` LIKE 'F%' LIMIT 25
;

-- TASK SEVEN
-- Using COUNT and JOIN ... ON, get the number of cities in China

CREATE VIEW task_07
AS
	SELECT COUNT(ci.ID) AS 'Cities in China'
    FROM city ci
    JOIN country co ON ci.countrycode=co.code
    WHERE co.`name` = 'China'
;

-- TASK EIGHT
-- Using IS NOT NULL, ORDER BY, and LIMIT, which country has the lowest population? Discard non-zero populations

CREATE VIEW task_08
AS
	SELECT `name` AS 'Country with lowest pop.'
    FROM country
    WHERE population IS NOT NULL
    ORDER BY population ASC LIMIT 1
;

-- TASK NINE
-- Using aggregate functions, return the number of countries the database contains

CREATE VIEW task_09
AS
	SELECT COUNT(DISTINCT `Code`) AS 'Countries in database'
    FROM country
;

-- TASK TEN
-- What are the top ten largest countries by area?

CREATE VIEW task_10
AS
	SELECT `name` AS 'Largest Countries by Area'
    FROM country
    ORDER BY surfacearea DESC LIMIT 10
;

-- TASK 11
-- List the five largest cities by population in Japan

CREATE VIEW task_11
AS
	SELECT ci.`name` AS 'Most Populated Cities in Japa'
    FROM city ci
    JOIN country co ON ci.countrycode=co.code
    WHERE co.`name` = 'Japan'
    ORDER BY ci.population DESC LIMIT 10
;

-- TASK 12
-- List the names and country codes of every country with Elizabeth II as its Head of State. 
-- You will need to fix the mistake first!

CREATE VIEW view_exists_to_avoid_opening_tab
AS
	SELECT headofstate 
    FROM country
;

UPDATE country
SET headofstate = 'Elizabeth II'
WHERE headofstate = 'Elisabeth II';

CREATE VIEW task_12
AS
	SELECT `Name` AS 'Country Name', `code` as 'Country Code'
    FROM country
    WHERE headofstate = 'Elizabeth II'
;

-- TASK 13
-- List the top ten countries with the smallest population-to-area ratio. 
-- Discard any countries with a ratio of 0

CREATE VIEW task_13
AS
	SELECT `name`, population/surfacearea AS 'P:SA Ratio'
    FROM country
    WHERE population/surfacearea > 0
    ORDER BY population/surfacearea DESC LIMIT 10
;

-- TASK 14
-- List every unique world language

CREATE VIEW task_14
AS
	SELECT DISTINCT `language`
    FROM countrylanguage
;

-- TASK 15
-- List the names and GNP of the world's top 10 richest countries

CREATE VIEW task_15
AS
	SELECT `name` AS 'Country', GNP AS 'Gross National Product'
    FROM country
    ORDER BY gnp DESC LIMIT 10
;

-- TASK 16
-- List the names of, and number of languages spoken by, the top ten most multilingual countries

CREATE VIEW task_16
AS
	SELECT c.`name` AS 'Country', COUNT(l.`language`) AS 'Number of languages spoken'
    FROM country c
    JOIN countrylanguage l ON c.code=l.countrycode
    GROUP BY c.code
    ORDER BY COUNT(l.`language`) DESC LIMIT 10
;

-- TASK 17
-- List every country where over 50% of its population can speak German

CREATE VIEW task_17
AS
	SELECT c.`name` AS 'Country', l.percentage AS 'German Speakers per Cent'
    FROM country c
    JOIN countrylanguage l ON c.code=l.countrycode
    WHERE l.`language` = 'German' AND l.percentage > 50
;

-- TASK 18
-- Which country has the worst life expectancy? Discard zero or null values

CREATE VIEW task_18
AS
	SELECT `name` AS 'Worst Life Expectancy'
    FROM country
    WHERE lifeexpectancy IS NOT NULL AND lifeexpectancy > 0
    ORDER BY lifeexpectancy ASC LIMIT 1
;

-- TASK 19
-- List the top three most common government forms

CREATE VIEW task_19
AS
	SELECT governmentform AS 'Most Common Form of Government'
    FROM country
    GROUP BY governmentform
    ORDER BY COUNT(governmentform) DESC LIMIT 3
;

-- TASK 20
-- How many countries have gained independence since records began?

CREATE VIEW task_20
AS
	SELECT COUNT(`name`) AS 'Countries who have gained Independance'
    FROM country
    WHERE indepyear IS NOT NULL
;

-- END OF WORLD CHALLENGE SCRIPT --

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

-- END OF FILE --