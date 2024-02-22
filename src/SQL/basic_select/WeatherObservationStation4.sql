SELECT
    ct.countt - unq.number_of_unique_city_names
FROM (
SELECT COUNT(DISTINCT CITY) AS number_of_unique_city_names
FROM station) unq,
(
SELECT COUNT(city) AS countt
FROM station) ct;