select ed1.ID as ID, count(ed2.id) as CHILD_COUNT
from ECOLI_DATA as ed1
-- ed2 테이블 id가 자식 id
left join ECOLI_DATA as ed2 on ed1.ID=ed2.PARENT_ID
group by ed1.ID
order by ID

