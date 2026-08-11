-- Last updated: 11/08/2026, 14:19:41
# Write your MySQL query statement below
WITH DailyAmount AS (
    SELECT 
        visited_on,
        SUM(amount) AS amount
    FROM 
        Customer
    GROUP BY 
        visited_on
),
RollingMetrics AS (
    SELECT 
        visited_on,
        SUM(amount) OVER(
            ORDER BY visited_on 
            ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
        ) AS amount,
        ROUND(AVG(amount) OVER(
            ORDER BY visited_on 
            ROWS BETWEEN 6 PRECEDING AND CURRENT ROW
        ), 2) AS average_amount
    FROM 
        DailyAmount
)
SELECT 
    visited_on, 
    amount, 
    average_amount
FROM 
    RollingMetrics
WHERE 
    visited_on >= (SELECT MIN(visited_on) FROM Customer) + INTERVAL 6 DAY
ORDER BY 
    visited_on ASC;