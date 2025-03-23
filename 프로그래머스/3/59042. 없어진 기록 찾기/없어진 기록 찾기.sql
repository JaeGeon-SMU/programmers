-- 코드를 입력하세요
SELECT a.ANIMAL_ID,a.NAME
from animal_outs as a
left outer join animal_ins as b on a.ANIMAL_ID = b.ANIMAL_ID
where b.datetime is null;
