
-- Active: 1745841329670@@127.0.0.1@3306@sakila

DESCRIBE sakila.film;

use sakila;

SELECT title,rental_duration,`length` FROM sakila.film
WHERE  NOT((rental_duration BETWEEN 3 AND 7)
AND length>50)
ORDER BY `length`, rental_duration
LIMIT 10;

SELECT DISTINCT rental_duration,`length` from sakila.film
ORDER BY rental_duration;

-- return top 3 values of length from film table

SELECT DISTINCT `length`,rental_duration as top_three_length
FROM sakila.film
ORDER BY title DESC
LIMIT 3;
SELECT `length`,rental_duration as top_three_length
FROM sakila.film
ORDER BY title DESC
LIMIT 3;

/* fetch the data of all the films which have a title starting from A */
SELECT * FROM sakila.film
WHERE title LIKE 'A%'

/* fetch all films which start with a 4 char word */
SELECT * from sakila.film
WHERE title LIKE '____ %';

/* for every film print the language */
SELECT f.title, l.name as language 
FROM sakila.film f
JOIN sakila.language l
ON f.language_id = l.language_id;

/* join 3 tables show film title with their respective actors */
select title,first_name,last_name from film_actor
join actor on film_actor.actor_id = actor.actor_id
join film on film_actor.film_id = film.film_id;


/* fetch employees with bonus<1000 */
SELECT * FROM staff_list;
SELECT * FROM staff;


SHOW tables;

select * from film;

desc actor;
select * from actor;

desc film_actor;
select * from film_actor;
