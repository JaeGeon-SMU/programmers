-- 코드를 작성해주세요
select ID, LENGTH
from FISH_INFO 
where length >10
order by length desc,id asc
limit 10
