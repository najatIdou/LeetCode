# Write your MySQL query statement below
#DELETE FROM Person WHERE email IN(SELECT email FROM(SELECT email FROM Person WHERE HAVING count(email)>1) as id) ;

DELETE p1 FROM Person p1 JOIN Person p2 ON p1.email LIKE p2.email WHERE p1.id!=p2.id AND p1.id>p2.id;