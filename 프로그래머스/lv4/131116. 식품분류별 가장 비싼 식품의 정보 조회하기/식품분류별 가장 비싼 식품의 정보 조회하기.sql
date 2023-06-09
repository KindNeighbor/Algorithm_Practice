SELECT CATEGORY, PRICE as MAX_PRICE, PRODUCT_NAME
from FOOD_PRODUCT 
where PRICE IN (
    select MAX(PRICE) from FOOD_PRODUCT group by CATEGORY)
    AND CATEGORY IN ("과자", "국", "김치", "식용유")
order by PRICE DESC

# SELECT CATEGORY, MAX(PRICE) as MAX_PRICE, PRODUCT_NAME
# from FOOD_PRODUCT 
# group by CATEGORY
# having CATEGORY = "과자"
# or CATEGORY = "국"
# or CATEGORY = "김치"
# or CATEGORY = "식용유"
# order by MAX_PRICE DESC