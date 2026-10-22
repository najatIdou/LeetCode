# Write your MySQL query statement below
#SELECT u.name, t.amount FROM Users u CROSS JOIN Transactions t ON u.account=t.account WHERE  ;

SELECT u.name, totals.balance FROM Users u JOIN (SELECT t.account, SUM(t.amount) as balance FROM Transactions t WHERE t.account IN(SELECT tt.account FROM Transactions tt WHERE t.account=tt.account) GROUP BY t.account HAVING SUM(t.amount)>10000)totals ON u.account=totals.account;


