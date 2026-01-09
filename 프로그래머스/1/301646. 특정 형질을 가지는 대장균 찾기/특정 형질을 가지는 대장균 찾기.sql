-- 코드를 작성해주세요
select count(*) as COUNT
from ECOLI_DATA
where CONV(GENOTYPE,10,2) like '1' or CONV(GENOTYPE,10,2) like '%01' or  (CONV(GENOTYPE,10,2) like '%10_') 