# Write your MySQL query statement below
SELECT product_name, year, price FROM Sales AS c INNER JOIN Product AS b WHERE c.product_id=b.product_id;