# Write your MySQL query statement below
#SELECT emp_id, (SELECT e.event_day, (e.out_time-e.in_time) FROM Employees e CROSS JOIN Employees s ON e.emp_id=s.emp_id and e.event_day=s.event_day group by e.event_day,e.emp_id) as total_time FROM Employees;

SELECT e.event_day as day, e.emp_id, SUM(e.out_time-e.in_time) as total_time FROM Employees e  group by e.event_day,e.emp_id