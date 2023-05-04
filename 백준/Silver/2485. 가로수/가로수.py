import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())
arr = []

def GCD(a,b):
    if(a%b==0):
        return b
    return GCD(b,a%b)
  
for i in range(a-1):
    c = int(sys.stdin.readline())
    arr.append(c-b)
    b = c

d = arr[0]
for i in range(1,len(arr)):
    d = GCD(arr[i],d)
  
sum = 0
for x in arr:
    sum += (x//d) - 1
print(sum)