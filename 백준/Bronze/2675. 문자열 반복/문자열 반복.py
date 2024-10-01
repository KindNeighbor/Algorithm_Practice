import sys

T = int(sys.stdin.readline())

for _ in range(T):
    str1 = "";
    R, S = sys.stdin.readline().split()
    R = int(R)
    
    for s in S:
        str1 += s * R
    
    print(str1)
    