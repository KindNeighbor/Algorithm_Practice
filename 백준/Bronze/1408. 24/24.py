A_hour, A_min, A_sec = map(int, input().split(":"))
B_hour, B_min, B_sec = map(int, input().split(":"))

time = B_hour * 3600 + B_min * 60 + B_sec - (A_hour * 3600 + A_min * 60 + A_sec)
if time < 0:
    time += 60 * 60 * 24

h = time // 3600 
m = (time % 3600) // 60 
s = time % 60

print("%02d:%02d:%02d" % (h,m,s))