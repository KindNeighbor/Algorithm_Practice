import sys

N = int(sys.stdin.readline())

road_dis = list(map(int, sys.stdin.readline().split()))
gas_price = list(map(int, sys.stdin.readline().split()))

sum = 0
tmp = gas_price[0]

for i in range(len(road_dis)):
    if tmp > gas_price[i]:
       tmp = gas_price[i]
    sum += tmp * road_dis[i]
 
print(sum)   