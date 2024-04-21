def solution(nums):
    unique_types = set(nums)
    max_picks = len(nums) // 2 
    distinct_types = len(unique_types)  
    
    return min(distinct_types, max_picks)