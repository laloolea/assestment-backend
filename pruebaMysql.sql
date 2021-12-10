CREATE DATABASE  IF NOT EXISTS assestment;
USE assestment;
/*Se crean las tablas de countries y languages*/
CREATE TABLE IF NOT EXISTS countries (id int AUTO_INCREMENT NOT NULL PRIMARY KEY, name VARCHAR (50),
       capital VARCHAR(50), population int, languageId int);

CREATE TABLE IF NOT EXISTS languages (id int AUTO_INCREMENT NOT NULL PRIMARY KEY, name VARCHAR (50));	

/*
INSERT INTO countries (name,capital,population,languageId) VALUES ("Mexico", "Ciudad de Mexico",1289000,0);
INSERT INTO countries (name,capital,population,languageId) VALUES ("Canada", "Ottawa",3801000,1);
*/

/*
INSERT INTO languages (name) VALUES ("Spanish");
INSERT INTO languages (name) VALUES ("English");
DELETE FROM countries WHERE population > 100000;
*/
UPDATE countries SET population = 250000 WHERE id = 0;
SELECT * FROM countries;
SELECT * FROM languages;

/*
Select country.name, country.capital
from languages
left join languages on country.id = languages.id
*/

SELECT COUNT(id), name
FROM languages
GROUP BY id;

