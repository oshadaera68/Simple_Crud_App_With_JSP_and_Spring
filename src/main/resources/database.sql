DROP
DATABASE IF EXISTS simple_crud;
CREATE
DATABASE IF NOT EXISTS simple_crud;
USE
simple_crud;

CREATE TABLE IF NOT EXISTS customer
(
    id
    MEDIUMINT
    PRIMARY
    KEY
    AUTO_INCREMENT,
    name
    VARCHAR
(
    45
),
    salary DOUBLE
    );

INSERT INTO customer(name, salary)
VALUES ('kamal', 25000);
INSERT INTO customer(name, salary)
VALUES ('Bandara', 258000);
INSERT INTO customer(name, salary)
VALUES ('Samantha', 46000);
INSERT INTO customer(name, salary)
VALUES ('Jayantha', 75000);
INSERT INTO customer(name, salary)
VALUES ('saman', 45000);
SELECT *
FROM customer;