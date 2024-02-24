SELECT
    cm.company_code,
    cm.founder,
    count(DISTINCT empl.lead_manager_code),
    count(DISTINCT empl.senior_manager_code),
    count(DISTINCT empl.manager_code),
    count(DISTINCT empl.employee_code)
FROM company cm
         JOIN employee empl ON empl.company_code = cm.company_code
GROUP BY cm.company_code, cm.founder
ORDER BY cm.company_code;