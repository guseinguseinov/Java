SELECT
    max(salary * months),
    count(salary * months)
FROM employee
GROUP BY salary * months
ORDER BY salary * months DESC
    LIMIT 1;