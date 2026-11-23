# Write your MySQL query statement below
#SELECT e.name FROM Employee e, Employee ep WHERE e.id=ep.managerId;

SELECT e.name as Employee FROM Employee e JOIN Employee ep ON e.managerId = ep.id WHERE e.salary > ep.salary;