select i1.ITEM_ID as ITEM_ID ,ITEM_NAME,RARITY
from ITEM_INFO as i1
join
(select it.ITEM_ID as pii
from ITEM_INFO as ii
join ITEM_TREE as it on ii.ITEM_ID = it.PARENT_ITEM_ID
where RARITY ='RARE') as i2 on i1.ITEM_ID=i2.pii
order by ITEM_ID desc



