SELECT m.MEMBER_NAME, r.REVIEW_TEXT, DATE_FORMAT(r.REVIEW_DATE, "%Y-%m-%d") AS REVIEW_DATE
from MEMBER_PROFILE m
join REST_REVIEW r
on m.MEMBER_ID = r.MEMBER_ID
where m.MEMBER_ID = (select MEMBER_ID 
                     from REST_REVIEW 
                     group by MEMBER_ID 
                     order by count(*)
                     DESC limit 1)
order by REVIEW_DATE, REVIEW_TEXT