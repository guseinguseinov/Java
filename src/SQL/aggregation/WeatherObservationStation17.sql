SELECT
    round(long_w,4)
FROM station
WHERE lat_n = (select min(lat_n) from station WHERE lat_n > 38.7780);