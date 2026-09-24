# Write your MySQL query statement below
SELECT ROUND(SUM(i1.tiv_2016),2) AS tiv_2016 FROM Insurance i1 WHERE i1.tiv_2015 IN(SELECT i2.tiv_2015 FROM Insurance i2 WHERE i1.tiv_2015=i2.tiv_2015 AND i1.pid!=i2.pid) AND NOT EXISTS(SELECT lat,lon FROM Insurance WHERE i1.lat=lat AND i1.lon=lon AND i1.pid!=pid);
