-- Create the table for the database
CREATE TABLE books(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    book VARCHAR(455) NOT NULL,
    author VARCHAR(455) NOT NULL,
    description VARCHAR(755) NOT NULL
);