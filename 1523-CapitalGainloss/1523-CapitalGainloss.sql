-- Last updated: 11/08/2026, 14:18:58
# Write your MySQL query statement below
SELECT stock_name, 
       SUM(CASE WHEN operation = 'Buy' THEN -price ELSE price END) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name;