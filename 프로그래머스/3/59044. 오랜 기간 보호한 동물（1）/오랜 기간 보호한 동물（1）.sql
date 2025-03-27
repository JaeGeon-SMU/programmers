-- 코드를 입력하세요
SELECT a.name,a.datetime
from ANIMAL_INS as a
left join ANIMAL_OUTS as b on a.ANIMAL_ID=b.ANIMAL_ID
where b.ANIMAL_ID is null
order by a.datetime
limit 3