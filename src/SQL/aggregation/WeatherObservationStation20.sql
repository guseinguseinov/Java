SELECT ROUND(MAX(lat_n), 4)
FROM (
         SELECT lat_n, NTILE(2) OVER (ORDER BY lat_n) AS tile
         FROM station
     ) AS tiled_data
WHERE tile = 1;