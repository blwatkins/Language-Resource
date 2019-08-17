LOAD DATA LOCAL INFILE 'file_name'
INTO TABLE Table_Name
FIELDS TERMINATED BY ','
LINES TERMINATED BY '\n'
IGNORE 1 LINES -- if header row
(column_names);