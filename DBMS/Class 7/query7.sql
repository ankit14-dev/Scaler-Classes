select * from sakila.film

SELECT title,
CASE 
    WHEN `length`>100 THEN "long"
    WHEN `length` BETWEEN 50 AND 100 THEN "medium"
    WHEN `length`<50 THEN "short"
    ELSE "unknown"
END AS length_category
FROM sakila.film;

/* triangle or not
 */