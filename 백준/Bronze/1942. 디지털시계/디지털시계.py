import sys

def change(time):
   h, m, s = map(int, time.split(":"))
   return h * 10000 + m * 100 + s

def is_valid_time(t):
   h = t // 10000
   m = (t % 10000) // 100
   s = t % 100
   return 0 <= h <= 23 and 0 <= m <= 59 and 0 <= s <= 59

def count_3_multiples_in_segment(start, end):
   if start > end:
       return 0
   if start < 6000 and end > 9999:
       return (count_3_multiples_in_segment(start, 5959) + 
               count_3_multiples_in_segment(10000, end))
   elif 6000 <= start <= 9999 or 6000 <= end <= 9999:
       return 0
       
   first = start + (3 - (start % 3)) % 3
   while first <= end and not is_valid_time(first):
       first += 3
       
   last = end - (end % 3)
   while last >= start and not is_valid_time(last):
       last -= 3
       
   if first > end or last < start:
       return 0
   
   count = 0
   for num in range(first, last + 1, 3):
       if is_valid_time(num):
           count += 1
   return count

def count_in_range(start, end):
   if end < start:
       return (count_3_multiples_in_segment(start, 235959) + 
               count_3_multiples_in_segment(0, end))
   else:
       return count_3_multiples_in_segment(start, end)

a1, b1 = sys.stdin.readline().split()
a2, b2 = sys.stdin.readline().split()
a3, b3 = sys.stdin.readline().split()

int_a1 = change(a1)
int_b1 = change(b1)
int_a2 = change(a2)
int_b2 = change(b2)
int_a3 = change(a3)
int_b3 = change(b3)

print(count_in_range(int_a1, int_b1))
print(count_in_range(int_a2, int_b2))
print(count_in_range(int_a3, int_b3))