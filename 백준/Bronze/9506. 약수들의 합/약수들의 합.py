while(True):
    N = int(input())
    
    if N == -1:
        break
        
    list1 = []
    sum = 0
    for i in range(1, N):
        if N % i == 0:
            list1.append(i)
            sum += i
    if sum == N:
        result = " + ".join(str(i) for i in list1)
        print(f"{N} = {result}")
    else:
        print(str(N) + " is NOT perfect.")
    
            
        