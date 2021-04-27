-- Create the table and its colums
CREATE TABLE todo(
    id SERIAL UNIQUE,
    name TEXT NOT NULL,
    completed BOOL NOT NULL
);