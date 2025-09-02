SELECT * from film;

UPDATE film
SET original_language_id=CASE 
    WHEN `length`<=50 THEN 2
    WHEN `length`>50 and `length`<=100 then 3
    WHEN `length`>100 and `length`<=150 then 4
    WHEN `length`>150 then 5
END;

select * from language;

select title,l1.name,l2.name
from film
join language l1
on film.language_id=l1.language_id
JOIN language l2
on film.original_language_id=l2.language_id;

update film
SET release_year=CASE 
    WHEN original_language_id=1 THEN 2005
    WHEN original_language_id=2 THEN 2006
    WHEN original_language_id=3 THEN 2004
    WHEN original_language_id=4 THEN 2003
    WHEN original_language_id=5 THEN 2005 
    Else 2006
END;

SELECT f1.title,f1.release_year,f2.title,f2.release_year from film f1
join film f2
on (f2.release_year BETWEEN f1.release_year-2 and f1.release_year+2)
    and f2.rental_duration>f1.rental_duration;

select 0 from film;

SELECT count(*) FROM film
WHERE rental_duration<=4;

select count(*) from (
    select actor_id from film_actor
    GROUP BY actor_id
    HAVING COUNT(actor_id)>=2
);

select title from film
WHERE `length`> (select AVG(`length`) from film);