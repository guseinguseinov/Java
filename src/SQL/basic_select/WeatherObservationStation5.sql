SELECT
    city , LENGTH(city) as lng
FROM station
ORDER BY lng, city
    LIMIT 1;

SELECT
    city , LENGTH(city) AS lng
FROM station
ORDER BY lng DESC, city
    LIMIT 1;