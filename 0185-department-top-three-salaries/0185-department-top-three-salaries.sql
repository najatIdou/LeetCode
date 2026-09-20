# Write your MySQL query statement below

 #---get the depart name, emp name, salary from join tables emp and depart---
#SELECT d.name as Department, e.name as Employee, e.salary as Salary FROM Employee as e JOIN Department as d ON d.id=e.departmentId WHERE e.salary=() ORDER BY d.name ASC;  

#---get the rank of each salary ranking for each depart
SELECT d.name as Department, e.name as Employee, e.salary as Salary FROM (SELECT departmentId, name, salary, dense_rank() OVER (partition by departmentId ORDER BY salary DESC) as rankSalary FROM Employee ORDER BY departmentId ASC) as e JOIN Department as d ON d.id=e.departmentId WHERE rankSalary<=3 ;







