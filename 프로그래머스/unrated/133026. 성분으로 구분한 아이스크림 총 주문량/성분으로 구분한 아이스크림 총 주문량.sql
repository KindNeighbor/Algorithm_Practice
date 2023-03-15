SELECT b.INGREDIENT_TYPE, SUM(a.TOTAL_ORDER) as TOTAL_ORDER
FROM FIRST_HALF a
JOIN ICECREAM_INFO b
ON a.FLAVOR = b.FLAVOR
GROUP BY b.INGREDIENT_TYPE
ORDER BY a.TOTAL_ORDER;
