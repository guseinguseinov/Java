SELECT
    s.hacker_id,
    h.name
FROM
    submissions s
        JOIN
    challenges c ON s.challenge_id = c.challenge_id
        JOIN
    difficulty d ON d.difficulty_level = c.difficulty_level
        JOIN
    hackers h ON h.hacker_id = s.hacker_id
WHERE
        s.score = d.score
GROUP BY
    s.hacker_id, h.name
HAVING
        COUNT(DISTINCT s.challenge_id) > 1
ORDER BY
    COUNT(DISTINCT s.challenge_id) DESC, s.hacker_id;