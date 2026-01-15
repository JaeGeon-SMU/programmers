-- 코드를 작성해주세요
select SUM(hg.SCORE) as SCORE,hg.EMP_NO as EMP_NO ,EMP_NAME,POSITION,EMAIL
from HR_EMPLOYEES as he
join HR_GRADE as hg
on he.EMP_NO = hg.EMP_NO
where hg.YEAR=2022
group by hg.EMP_NO
order by SCORE desc
limit 1