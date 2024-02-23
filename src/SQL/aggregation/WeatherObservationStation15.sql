SELECT
    round(long_w,4)
FROM station
WHERE lat_n = (select max(lat_n) from station WHERE lat_n < 137.2345);