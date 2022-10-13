use introToSQL;

ALTER TABLE people 
ADD favourite_fruit VARCHAR(250);

UPDATE people
SET favourite_fruit = 'raspberry'
WHERE forename = 'Emily';

UPDATE people
SET favourite_fruit = 'orange'
WHERE id = 2;