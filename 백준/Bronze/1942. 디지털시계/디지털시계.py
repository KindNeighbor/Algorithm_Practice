import sys

def change(time):
    h, m, s = map(int, time.split(":"))
    return h * 10000 + m * 100 + s

def is_valid_time(t):
    h = t // 10000
    m = (t % 10000) // 100
    s = t % 100
    return 0 <= h <= 23 and 0 <= m <= 59 and 0 <= s <= 59

def count_multiples(start, end):
    if start < 6000 and end > 9999:
        return count_multiples(start, 5959) + count_multiples(10000, end)
    if 6000 <= start <= 9999 or 6000 <= end <= 9999:
        return 0

    curr = start + (3 - (start % 3)) % 3
    end = end - (end % 3)
    
    count = 0
    while curr <= end:
        if is_valid_time(curr):
            count += 1
        curr += 3
    return count

times = [sys.stdin.readline().split() for _ in range(3)]
for start, end in times:
    start_time = change(start)
    end_time = change(end)
    
    if end_time < start_time:
        print(count_multiples(start_time, 235959) + count_multiples(0, end_time))
    else:
        print(count_multiples(start_time, end_time))