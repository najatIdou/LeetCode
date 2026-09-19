# Write your MySQL query statement below
#SELECT employee_id, department_id FROM Employee WHERE primary_flag LIKE 'Y' AND (SELECT * FROM Employee WHERE primary_flag LIKE 'N' AND department_id=1) GROUP BY employee_id;
#SELECT employee_id FROM Employee WHERE primary_flag LIKE 'N' GROUP BY employee_id HAVING count(department_id)=1;

#) GROUP BY employee_id
#SELECT employee_id, department_id FROM Employee WHERE primary_flag LIKE 'Y' AND employee_id = (

SELECT employee_id, department_id FROM Employee WHERE primary_flag LIKE 'Y' OR employee_id IN (SELECT e1.employee_id FROM Employee e1 LEFT JOIN Employee e2 ON e1.employee_id=e2.employee_id WHERE e1.primary_flag LIKE 'N' GROUP BY e1.employee_id HAVING count(e1.department_id)=1);