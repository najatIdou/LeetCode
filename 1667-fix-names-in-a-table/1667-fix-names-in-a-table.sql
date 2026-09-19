# Write your MySQL query statement below
SELECT user_id, Concat(UPPER(LEFT(name,1)), LOWER(SUBSTRING(name,2)))as name FROM Users ORDER BY user_id;