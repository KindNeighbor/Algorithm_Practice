def func(n):
    n_str = str(n) 
    for i in range(1, len(n_str)):

        front = n_str[:i]
        back = n_str[i:]
        
        front_product = 1
        for i in front:
            front_product *= int(i)
            
        back_product = 1
        for i in back:
            back_product *= int(i)
        
        if front_product == back_product:
            return "YES"
    
    return "NO"

A = int(input())
print(func(A))