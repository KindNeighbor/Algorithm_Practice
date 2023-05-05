def solution(arr):
    cnt = 0
    b = arr.copy()
    while 1:
        for i in range(len(arr)):
            if arr[i]%2==0 and arr[i]>=50:
                arr[i] //= 2
            elif arr[i]%2!=0 and arr[i]<50:
                arr[i] = arr[i]*2 + 1
        cnt += 1
        
        if b != arr:
            b = arr.copy()
        elif b == arr:
            return cnt - 1
        