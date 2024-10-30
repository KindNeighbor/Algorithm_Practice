X = int(input())

# 2 / 3 3 / 4 4 4 / 5 5 5 5 
# 1/1 | 1/2 2/1 | 3/1 2/2 1/3 | 1/4 2/3 3/2 4/1 |
# 1 / 1 2 / 3 2 1 / 1 2 3 4 / 5 4 3 2 1
# 1 / 2 1 / 1 2 3 / 4 3 2 1 / 1 2 3 4 5

top = 0
bot = 1
idx = 2
num = 1

son = -1
mom = -1
while(True):
    if num < X:
        num += idx
        idx += 1
        if top == 0:
            top = 1
        else:
            top = 0
        if bot == 0:
            bot = 1
        else:
            bot = 0
    else:
        a = num - X
        a += 1
        if top == 1:
            son = idx - a
            mom = a
        else :
            son = a
            mom = idx - a
        break
            
print(str(son)+"/"+str(mom))