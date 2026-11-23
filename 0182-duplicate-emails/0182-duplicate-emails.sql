# Write your MySQL query statement below
SELECT DISTINCT p.email AS Email FROM Person p JOIN Person pr ON p.id!=pr.id AND p.email=pr.email; 