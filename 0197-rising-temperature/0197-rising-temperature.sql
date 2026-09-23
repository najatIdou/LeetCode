# Write your MySQL query statement below
SELECT w1.id as Id FROM Weather w1 JOIN Weather w2 ON w1.id!=w2.id where w1.temperature>w2.temperature AND DATEDIFF(w1.recordDate,w2.recordDate)=1;