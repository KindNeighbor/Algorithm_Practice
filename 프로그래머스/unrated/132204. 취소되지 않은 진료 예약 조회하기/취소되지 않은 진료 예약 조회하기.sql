SELECT ap.APNT_NO, p.PT_NAME, p.PT_NO, ap.MCDP_CD, d.DR_NAME, ap.APNT_YMD
from APPOINTMENT ap
join PATIENT p on p.PT_NO = ap.PT_NO
join DOCTOR d on d.DR_ID = ap.MDDR_ID
where ap.APNT_YMD like '2022-04-13%' and ap.APNT_CNCL_YMD is null
and ap.MCDP_CD = 'CS'
order by ap.APNT_YMD