str = input()
r = ""

for i in str:
    if i.islower():
        r += i.upper()
    elif i.isupper():
        r += i.lower()
print(r)