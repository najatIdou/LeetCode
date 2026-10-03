# Write your MySQL query statement below
#SELECT  ROUND(count(CASE WHEN d1.customer_pref_delivery_date = d1.order_date THEN 1 END)/ count(d1.delivery_id)*100,2) AS immediate_percentage FROM Delivery d1 ;


SELECT ROUND(count(CASE WHEN d1.customer_pref_delivery_date = d1.order_date THEN 1 END)/ count(d1.delivery_id)*100,2) AS immediate_percentage from Delivery d1 where d1.order_date =(SELECT min(d2.order_date) FROM Delivery d2 WHERE d1.customer_id=d2.customer_id);