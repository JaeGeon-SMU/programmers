-- 코드를 작성해주세요
select YEAR(DIFFERENTIATION_DATE) as YEAR,(b.max_size-SIZE_OF_COLONY) as YEAR_DEV,ID
from ECOLI_DATA as a
join (
    select MAX(SIZE_OF_COLONY) as max_size , YEAR(DIFFERENTIATION_DATE) as y
    from ECOLI_DATA
    group by YEAR(DIFFERENTIATION_DATE)
) as b on YEAR(a.DIFFERENTIATION_DATE) = b.y
order by YEAR,YEAR_DEV