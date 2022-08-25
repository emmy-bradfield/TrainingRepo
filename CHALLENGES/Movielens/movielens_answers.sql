-- SCRIPT FOR MOVIELENS CHALLENGE TASKS --
USE movielens;
DROP VIEW IF EXISTS task_01, task_02, v_task_02, task_03, v_1_task_03, v_2_task_03, v_3_task_03,
v_4_task_03, task_04, v_1_task_04, task_05;

-- TASK ONE
-- List the titles and release dates of movies released between 1983-1993 in reverse chronological order

CREATE VIEW task_01
AS
	SELECT title AS 'Movie', release_date AS 'Released'
    FROM movies
    WHERE release_date BETWEEN '1983-01-01' AND '1993-12-31'
    ORDER BY release_date DESC
;

-- TASK TWO
-- Without using LIMIT, list the titles of the movies with the lowest average rating

CREATE VIEW v_task_02
AS
	SELECT AVG(rating) AS 'Rating', movie_id
    FROM ratings
    GROUP BY movie_id
;

CREATE VIEW task_02
AS
	SELECT m.title AS 'Movie', v.rating AS 'Rating'
    FROM v_task_02 v
    JOIN movies m ON m.id=v.movie_id
    WHERE v.rating < 2
    ORDER BY v.rating ASC 
;

-- TASK THREE
-- List the unique records for Sci-Fi movies where male 24-year-old students have given 5-star ratings

CREATE VIEW v_1_task_03
AS
	SELECT DISTINCT o.id, o.`name`, u.age, u.gender
    FROM occupations o
    JOIN users u ON o.id=u.occupation_id
;

CREATE VIEW v_2_task_03
AS
	SELECT DISTINCT r.movie_id
    FROM ratings r
    JOIN v_1_task_03 v ON v.id=r.user_id
    WHERE v.age = 24 AND v.gender = 'M' AND v.`name` = 'Student'
;

CREATE VIEW v_3_task_03
AS
	SELECT m.title, m.id
    FROM movies m
    JOIN v_2_task_03 v ON v.movie_id=m.id
;

CREATE VIEW v_4_task_03
AS
	SELECT g.genre_id, v.title
    FROM genres_movies g
    JOIN v_3_task_03 v ON g.movie_id=v.id
;

CREATE VIEW task_03
AS
	SELECT DISTINCT v.title AS 'Movie' , g.`name` AS 'Genre'
    FROM v_4_task_03 v
    JOIN genres g ON v.genre_id=g.id
    WHERE g.`name` = 'Sci-Fi'
;

-- TASK FIVE
-- Find the total number of movies in each genre; list the results in ascending numeric order

CREATE VIEW task_05
AS
	SELECT g.`name` AS 'Genre', COUNT(m.genre_id) 'Number of Movies'
    FROM genres_movies m
    JOIN genres g ON m.genre_id=g.id
    GROUP BY g.`name` 
    ORDER BY COUNT(m.genre_id) ASC
;

-- END OF MOVIELENS CHALLENGE SCRIPT --

SELECT * FROM task_01;
SELECT * FROM task_02;
SELECT * FROM task_03;
SELECT * FROM task_04;
SELECT * FROM task_05;

-- END OF FILE --