# Write your MySQL query statement below
/*SELECT c.customer_id FROM Customer c RIGHT JOIN Product p ON c.product_key=p.product_key  GROUP BY p.product_key;*/
SELECT c.customer_id FROM Customer c GROUP BY c.customer_id HAVING count(distinct(c.product_key))= (SELECT count(product_key) FROM Product);