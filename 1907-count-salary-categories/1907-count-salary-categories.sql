# Write your MySQL query statement below
#SELECT (SELECT COALESCE(CASE WHEN income<20000 THEN 'Low Salary' WHEN income BETWEEN 20000 AND 50000 THEN 'Average Salary'ELSE 'High Salary'END, 0)AS category FROM Accounts) as category,  ;

SELECT c.category, count(acc.account_id) as accounts_count FROM (SELECT 'Low Salary' AS category UNION ALL SELECT 'Average Salary' UNION ALL SELECT 'High Salary') c LEFT JOIN Accounts acc ON c.category = (CASE WHEN acc.income<20000 THEN 'Low Salary' WHEN acc.income BETWEEN 20000 AND 50000 THEN 'Average Salary' WHEN acc.income>50000 THEN 'High Salary' END ) GROUP BY c.category;


