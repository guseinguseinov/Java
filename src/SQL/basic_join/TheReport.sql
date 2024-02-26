SELECT
    CASE
        WHEN gr.grade < 8 THEN NULL
        ELSE st.name
        END AS name, gr.grade, st.marks
FROM students AS st
         JOIN grades AS gr ON st.marks BETWEEN gr.min_mark AND gr.max_mark
ORDER BY gr.grade DESC, st.name;