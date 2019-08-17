CREATE TABLE Employee (
    id INTEGER PRIMARY KEY,
    hire_date DATE NOT NULL
);

DELIMITER //

-- functions with procedures and control statements
CREATE FUNCTION getSeniority(d DATE)
    RETURNS VARCHAR(10)
    BEGIN
        DECLARE s VARCHAR(10);
        DECLARE hireLength INTEGER;
        SET hireLength = DATEDIFF(CURDATE(), d);

        IF hireLength < 365 THEN 
            SET s = 'newbie';
        ELSEIF hireLength >= 365 AND hireLength < 1826 THEN 
            SET s = 'junior';
        ELSE 
            SET s = 'senior';
        END IF;

        RETURN s;
    END; //

DELIMITER ;
