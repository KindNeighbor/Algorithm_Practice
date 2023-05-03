def solution(arr, delete_list):
    a = []
    for i in range(len(arr)):
        if arr[i] not in delete_list:
            a.append(arr[i])
    return a