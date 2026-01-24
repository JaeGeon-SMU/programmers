select ID,FISH_NAME,LENGTH
from FISH_INFO as fi
join FISH_NAME_INFO  as fni
on fi.FISH_TYPE = fni.FISH_TYPE
where (fi.fish_type,length) in
(
    select FISH_TYPE,MAX(LENGTH) as LENGTH
    from FISH_INFO
    group by FISH_TYPE
)



