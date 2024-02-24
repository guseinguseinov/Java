SELECT
    N,
    CASE
        WHEN P IS NULL THEN 'Root'
        WHEN N NOT in (SELECT P FROM BST WHERE P IS NOT NULL) then 'Leaf'
        ELSE 'Inner'
        END AS Nodetype
FROM BST
ORDER BY N;