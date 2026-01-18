select hd.dept_id as DEPT_ID, DEPT_NAME_EN,ROUND(avg(sal),0) as AVG_SAL
from HR_DEPARTMENT as hd
join HR_EMPLOYEES as he  on hd.DEPT_ID = he.DEPT_ID
group by hd.DEPT_ID
order by avg_sal desc
