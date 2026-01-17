-- 코드를 작성해주세요
select CONCAT(quarter(DIFFERENTIATION_DATE),"Q") as QUARTER,COUNT(*) as ECOLI_COUNT
from ECOLI_DATA
group by CONCAT(quarter(DIFFERENTIATION_DATE),"Q")
order by QUARTER