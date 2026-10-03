# Write your MySQL query statement below

SELECT q1.query_name, ROUND(AVG(q1.rating/q1.position),2) as quality, 
ROUND((COUNT(CASE WHEN q1.rating < 3 THEN 1 END)/count(q1.rating))*100,2) as poor_query_percentage FROM Queries q1 CROSS JOIN Queries q2 ON q1.query_name=q2.query_name AND q1.result=q2.result GROUP BY q1.query_name; 
