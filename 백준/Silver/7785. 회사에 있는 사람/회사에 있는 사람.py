import sys

a = int(input())
dic = {}

for i in range(a):
    name, s = input().split()
    dic[name] = s
    if s == "leave":
        del dic[name]
b = sorted(dic.items(), reverse=True)
dic = dict(b)

for k in dic.keys():
    print(k)