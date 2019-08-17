-- Create table example

PRAGMA foreign_keys = ON;
.mode col
.headers on

-- Example with SQLite Type Affinities
CREATE TABLE MyData (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    age INTEGER,
    photo_url TEXT UNIQUE NOT NULL
);

-- Example with SQL datatypes
CREATE TABLE Author (
    firstName VARCHAR(40),
    middleName VARCHAR(40),
    lastName VARCHAR(40) NOT NULL,
    birthYear INT(4),
    photo_url TEXT,
    myData_id INTEGER,
    PRIMARY KEY (firstName, middleName, lastName),
    FOREIGN KEY (myData_id) REFERENCES MyData(id)
);
