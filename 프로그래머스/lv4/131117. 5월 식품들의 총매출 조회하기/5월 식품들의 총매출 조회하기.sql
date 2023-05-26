-- 코드를 입력하세요
SELECT C.PRODUCT_ID AS PRODUCT_ID,C.PRODUCT_NAME AS PRODUCT_NAME,SUM(TOTAL)	AS TOTAL_SALES
FROM (SELECT A.PRODUCT_ID AS PRODUCT_ID,A.PRODUCT_NAME AS PRODUCT_NAME,(A.PRICE * B.AMOUNT) AS TOTAL
FROM FOOD_PRODUCT AS A JOIN  FOOD_ORDER AS B
ON A.PRODUCT_ID=B.PRODUCT_ID
WHERE DATE_FORMAT(B.PRODUCE_DATE,"%Y-%m") = "2022-05") AS C
GROUP BY  PRODUCT_ID
ORDER BY TOTAL_SALES DESC,PRODUCT_ID