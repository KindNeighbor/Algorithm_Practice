
SELECT OUTS.ANIMAL_ID, OUTS.NAME 
FROM ANIMAL_OUTS OUTS
JOIN ANIMAL_INS INS
ON OUTS.ANIMAL_ID = INS.ANIMAL_ID
ORDER BY OUTS.DATETIME - INS.DATETIME 
DESC LIMIT 2