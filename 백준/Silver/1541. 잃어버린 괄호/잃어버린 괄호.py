expression = input()

groups = expression.split('-')

first = sum(int(x) for x in groups[0].split('+'))


for i in range(1, len(groups)):
    rest = sum(int(x) for x in groups[i].split('+'))
    first -= rest

print(first)