SELECT
    CONCAT(name, '(', LEFT(occupation, 1), ')')
FROM occupations
order by name;

SELECT
    CONCAT('There are a total of ', count(occupation), ' ',  LOWER(occupation), 's.')
FROM occupations
GROUP BY occupation
ORDER BY count(occupation), occupation;