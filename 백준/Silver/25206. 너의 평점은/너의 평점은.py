score = []
grade = []

def grade_to_point(grade):
    grade_dict = {'A+': 4.5, 'A0': 4.0, 'B+': 3.5, 'B0': 3.0,
                  'C+': 2.5, 'C0': 2.0, 'D+': 1.5, 'D0': 1.0, 'F': 0.0}
    return grade_dict.get(grade, 0.0)

for i in range(20):
    a,b,c = input().split()
    score.append(float(b))
    grade.append(c)
    
sum1 = 0
sum2 = 0
for i in range(20):
    if grade[i] == 'P':
        continue
    sum1 += score[i] * grade_to_point(grade[i])
    sum2 += score[i]
    
print(sum1 / sum2)