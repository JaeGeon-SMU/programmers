-- 코드를 작성해주세요
select b.ITEM_ID, b.ITEM_NAME
from (
    select ITEM_ID
    from ITEM_TREE 
    where PARENT_ITEM_ID is null
)  as a
join ITEM_INFO as b
on a.ITEM_ID = b.ITEM_ID
order by b.ITEM_ID


