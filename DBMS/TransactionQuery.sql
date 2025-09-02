SELECT * from film;

update film
set release_year=2023
where film_id=15;

select release_year,film_id FROM film
where film_id=15;