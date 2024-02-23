SELECT
    sum(city.population)
FROM city
         JOIN country ON country.code = city.countrycode
WHERE country.continent = 'Asia';