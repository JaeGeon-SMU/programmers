-- 코드를 입력하세요

SELECT A.CATEGORY , A.PRICE , A.PRODUCT_NAME
FROM FOOD_PRODUCT AS A
JOIN
(SELECT CATEGORY, MAX(PRICE) AS C
FROM FOOD_PRODUCT
GROUP BY CATEGORY
HAVING REGEXP_LIKE(CATEGORY,"과자|국|김치|식용유")) AS B
ON A.CATEGORY= B.CATEGORY AND A.PRICE =B.C
ORDER BY B.C DESC