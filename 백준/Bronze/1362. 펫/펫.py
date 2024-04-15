idx = 0

while True:
    o, w = map(int, input().split())
    if o == 0 and w == 0:
        quit()
    die = False
    while True:
        act, n = input().split()
        if act == '#' and n == '0':
            break
        if not die:
            n = int(n)
            if act == 'F':
                w += n
            elif act == 'E':
                w -= n
        if w <= 0:
            die = True
    idx += 1
    if w <= 0:
        print(str(idx) + " RIP")
    elif o / 2 < w < o * 2:
        print(str(idx) + " :-)")
    else:
        print(str(idx) + " :-(")