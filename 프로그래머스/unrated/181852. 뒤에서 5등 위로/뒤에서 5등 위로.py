def solution(num_list):
    num_list.sort()
    ans = []
    for i in range(5, len(num_list)):
        ans.append(num_list[i])
    return ans
    