-- 코드를 입력하세요
SELECT A.NAME , A.DATETIME
FROM ANIMAL_INS AS A LEFT OUTER JOIN ANIMAL_OUTS AS B
ON A.ANIMAL_ID =B.ANIMAL_ID
WHERE B.DATETIME IS NULL
ORDER BY A.DATETIME
LIMIT 3
