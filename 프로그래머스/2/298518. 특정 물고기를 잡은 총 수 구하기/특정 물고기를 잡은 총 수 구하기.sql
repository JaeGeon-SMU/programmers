-- 코드를 작성해주세요
select count(*) as FISH_COUNT
from FISH_INFO as f1 
join FISH_NAME_INFO as f2
on f1.FISH_TYPE = f2.FISH_TYPE
where f2.FISH_NAME = 'BASS' or f2.FISH_NAME ='SNAPPER'
