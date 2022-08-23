CREATE DATABASE IF NOT EXISTS databases;
USE databases;

CREATE TABLE IF NOT EXISTS Customers (
    `cust_id`INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) NOT NULL,
    PRIMARY KEY (cust_id)
);

CREATE TABLE IF NOT EXISTS Products (
    `prod_id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) NOT NULL,
    `cost` INT NOT NULL,
    PRIMARY KEY (prod_id)
);

CREATE TABLE IF NOT EXISTS Sales (
    `sale_id` INT NOT NULL AUTO_INCREMENT,
    `date` DATE NOT NULL,
    `fk_cust` INT NOT NULL,
    `fk_prod` INT NOT NULL,
    PRIMARY KEY (sale_id),
    FOREIGN KEY (fk_cust) REFERENCES Customers(cust_id),
    FOREIGN KEY (kf_prod) REFERENCES Products(prod_id)
);

SELECT * FROM Customers;
SELECT * FROM Products;
SELECT * FROM Sales;