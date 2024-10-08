word = input()

croatian = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
    
for alphabet in croatian:
        word = word.replace(alphabet, '*')

print(len(word))