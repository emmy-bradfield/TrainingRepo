-- Part 1: Creating a database called Game Shop DB 3 with three tables for customers, products, and orders
-- using Data Design Langauage (DDL)

CREATE DATABASE IF NOT EXISTS gameshopdbthree;
USE gameshopdbthree;

DROP TABLE Orders;
DROP TABLE Customers;
DROP TABLE Products;

CREATE TABLE IF NOT EXISTS Customers (
	customerID int NOT NULL AUTO_INCREMENT, 
	customerName varchar(40) NOT NULL, 
	customerEmail varchar(60) UNIQUE NOT NULL,
    customerHouse int NOT NULL,
    customerPostcode varchar(8) NOT NULL,
	PRIMARY KEY (customerID)
);

CREATE TABLE IF NOT EXISTS Products (
productID int NOT NULL AUTO_INCREMENT,
productName varchar(60) NOT NULL,
productCost decimal (6,2) NOT NULL,
productStock int NOT NULL,
PRIMARY KEY (productID)
);

CREATE TABLE IF NOT EXISTS Orders (
	orderID int NOT NULL AUTO_INCREMENT,
    fk_customerID INT NOT NULL,
    fk_productID INT NOT NULL,
    productQuantity INT NOT NULL,
    orderDate DATE,
    PRIMARY KEY (orderID),
    FOREIGN KEY (fk_customerID) REFERENCES Customers(customerID),
    FOREIGN KEY (fk_productID) REFERENCES Products(productID)
);

-- Part Two: Populating the tables with data and manipulating as needed used Data Manipulation
-- language (DML)

INSERT INTO Customers (customerName, customerEmail, customerHouse, customerPostcode)
VALUES ('Sue Donym', 'sue.donym@email.co.uk', 74, 'SO17 3SX');
INSERT INTO Customers (customerName, customerEmail, customerHouse, customerPostcode)
VALUES ('Fae Ku-Nem', 'faekn@email.co.uk', 12, 'SN11 0UB');
INSERT INTO Customers (customerName, customerEmail, customerHouse, customerPostcode)
VALUES ('May Dup', 'daydup1990@email.co.uk', 80, 'W13 9EB');
INSERT INTO Customers (customerName, customerEmail, customerHouse, customerPostcode)
VALUES ('Imogen Airy', 'airy-immy@email.co.uk', 3, 'SO14 6WL');
INSERT INTO Customers (customerName, customerEmail, customerHouse, customerPostcode)
VALUES ('Jay Macun-Disup', 'jayconstruction@email.co.uk', 15, 'N15 6ES');

INSERT INTO Products (productName, productCost, productStock)
VALUES ('The Sims', 11.99, 5);
INSERT INTO Products (productName, productCost, productStock)
VALUES ('The Sims 2', 19.99, 9);
INSERT INTO Products (productName, productCost, productStock)
VALUES ('The Sims 3', 24.99, 5);
INSERT INTO Products (productName, productCost, productStock)
VALUES ('The Sims 4', 29.99, 23);
INSERT INTO Products (productName, productCost, productStock)
VALUES ('The Sims 4 + DLC', 35.99, 19);

INSERT INTO Orders (fk_customerID, fk_productID, productQuantity, orderDate)
VALUES (1, 1, 1, '2022-06-27');
INSERT INTO Orders (fk_customerID, fk_productID, productQuantity, orderDate)
VALUES (2, 2, 1, '2022-06-27');
INSERT INTO Orders (fk_customerID, fk_productID, productQuantity, orderDate)
VALUES (3, 3, 1, '2022-06-27');
INSERT INTO Orders (fk_customerID, fk_productID, productQuantity, orderDate)
VALUES (4, 4, 2, '2022-06-27');
INSERT INTO Orders (fk_customerID, fk_productID, productQuantity, orderDate)
VALUES (5, 5, 1, '2022-06-27');

SELECT * FROM Customers;
SELECT * FROM Products;
SELECT * FROM Orders;

-- **START OF EDITING EXERCISE. HERE TO LINE 119 RESULTS IN DELETION OF ALL DATA: REMOVE LINES TO RESOLVE**

UPDATE Customers
SET customerName='Sue Doneem'
WHERE customerName='Sue Donym';
UPDATE Customers
SET customerEmail='sue-doneem@email.co.uk'
WHERE customerEmail='sue.donym@email.co.uk';
SELECT * FROM Customers;

UPDATE Products
SET productCost=9.99
WHERE productCost=11.99;
UPDATE Products
SET productName='The Sims **SALE ITEM**'
WHERE productName='The Sims';
SELECT * FROM Products;

UPDATE Orders
SET productQuantity='3'
WHERE productQuantity='2';
UPDATE Orders
SET productQuantity='2'
WHERE productQuantity='1';
SELECT * FROM Orders;

DELETE FROM Orders WHERE orderID < 3;
DELETE FROM Products WHERE productID < 3;
DELETE FROM Customers WHERE customerID < 3;
SELECT * FROM Customers;
SELECT * FROM Products;
SELECT * FROM Orders;

DELETE FROM Orders;
DELETE FROM Products;
DELETE FROM Customers;
SELECT * FROM Customers;
SELECT * FROM Products;
SELECT * FROM Orders;

-- **START OF EDITING EXERCISE. LINE 79 TO HERE RESULTS IN DELETION OF ALL DATA: REMOVE LINES TO RESOLVE**
-- Part Three: Using Database Query Language (DQL) and select to read databases

SHOW databases;
SHOW tables;
DESCRIBE Customers;

SELECT customerName from Customers;
SELECT * FROM Products WHERE ProductStock < 10;
SELECT productCost, productStock, productStock*productCost AS totalValue FROM Products;
SELECT productCost, productName FROM Products ORDER BY productCost DESC;
SELECT customerName, customerEmail FROM Customers ORDER BY customerName ASC LIMIT 2;

-- Part Four: Using DQL and select to answer questions about your customer base

-- What is the most expensive product?
SELECT MAX(productCost)
FROM Products;

-- Which customer has made the most purchases?

SELECT fk_customerID, COUNT(fk_customerID)
FROM Orders
GROUP BY fk_customerID;

-- As all customers have made one, I will be adding a few lines of code to make this useful

INSERT INTO Orders (fk_customerID, fk_productID, productQuantity, orderDate)
VALUES (1, 1, 2, '2022-06-28');

SELECT fk_customerID, COUNT(fk_customerID)
FROM Orders
GROUP BY fk_customerID LIMIT 1;

-- Part Five: Nested Queries and Joins to review data

SELECT customerID, customerName
FROM Customers
WHERE customerID = (
	SELECT fk_customerID
    FROM Orders
    WHERE orderID = 1
);

CREATE VIEW customer_order_ID_1
AS
	SELECT fk_customerID
    FROM Orders
    WHERE orderID = 1
;
SELECT * FROM customer_order_ID_1;