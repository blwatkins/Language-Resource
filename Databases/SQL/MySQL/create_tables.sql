-- create tables
CREATE TABLE author(
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	first_name VARCHAR(10),
	last_name VARCHAR(10)
);

CREATE TABLE book(
	id INTEGER PRIMARY KEY AUTO_INCREMENT, 
	title VARCHAR(50), 
	author_id INTEGER, 
	FOREIGN KEY (author_id) REFERENCES author (id)
);

-- show schema of author table
DESCRIBE author;

-- Insert values into tables
INSERT INTO author (first_name, last_name)
VALUES ('Jane', 'Austen');

INSERT INTO book (title, author_id) 
VALUES ('Pride and Prejudice', 1);