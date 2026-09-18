# Write your MySQL query statement below
SELECT distinct class FROM Courses group by class HAVING count(class)>=5;