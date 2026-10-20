# Write your MySQL query statement below
UPDATE Salary SET sex = CASE 
    WHEN sex='f' THEN 'm' 
    WHEN sex='m' THEN 'f' 
    ELSE sex 
END
WHERE sex='f' OR sex='m';
#SET sex='m' WHERE sex='f' AND SET sex='f' WHERE set='m'