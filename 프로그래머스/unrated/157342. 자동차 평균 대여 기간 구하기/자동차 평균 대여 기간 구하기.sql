SELECT CAR_ID,
ROUND(AVG(DATEDIFF(END_DATE, START_DATE)) + 1, 1) as AVERAGE_DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
HAVING average_duration >= 7
ORDER BY AVERAGE_DURATION DESC,
CAR_ID DESC;