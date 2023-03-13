SELECT OUTS.ANIMAL_ID, OUTS.NAME FROM ANIMAL_OUTS OUTS
LEFT OUTER JOIN ANIMAL_INS INS 
ON OUTS.ANIMAL_ID = INS.ANIMAL_ID
WHERE INS.ANIMAL_ID is null
ORDER BY ANIMAL_ID ASC;