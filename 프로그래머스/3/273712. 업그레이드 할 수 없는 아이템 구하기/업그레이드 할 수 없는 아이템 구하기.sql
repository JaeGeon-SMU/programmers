select ITEM_ID,ITEM_NAME,RARITY
from ITEM_INFO
where ITEM_ID not IN 
(select ifnull(PARENT_ITEM_ID,-1) as ITEM_ID
from ITEM_TREE)
order by ITEM_ID desc