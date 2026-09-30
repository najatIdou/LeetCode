# Write your MySQL query statement below
#SELECT p.product_id, (p.price*u.units)/count(u.units) as average_price FROM Prices p LEFT JOIN UnitsSold u ON p.product_id=u.product_id WHERE u.purchase_date BETWEEN p.start_date AND p.end_date GROUP BY p.product_id;

#SELECT p.product_id, AVG(p.price) AS average_price FROM Prices p CROSS JOIN UnitsSold u ON p.product_id=u.product_id WHERE u.purchase_date BETWEEN p.start_date AND p.end_date GROUP BY p.product_id;

SELECT p.product_id, ROUND((COALESCE(SUM(p.price * u.units) / SUM(u.units), 0)),2) AS average_price FROM Prices p LEFT JOIN UnitsSold u ON p.product_id=u.product_id AND u.purchase_date BETWEEN p.start_date AND p.end_date GROUP BY p.product_id
