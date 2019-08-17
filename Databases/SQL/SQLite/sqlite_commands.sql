-- 1 November 2017

-- read in a .sql file
.read <file_name>

-- read in a csv file
.mode csv
.import <file_name> <table_name>

-- turn on columns
.mode col

-- turn on column headers
.headers on

-- turn on foreign keys
PRAGMA foreign_keys = ON;

-- turn off automatic indexes
PRAGMA automatic_index = 0;

-- print table information
PRAGMA table_info(<table_name>);

-- print create statements
.schema

-- quit the sqlite program
.quit
