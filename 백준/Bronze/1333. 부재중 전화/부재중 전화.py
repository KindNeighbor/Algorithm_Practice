N, L, D = map(int, input().split(" "));

def earliest_time_to_hear_bell(N, L, D):
    total_time = (L + 5) * N - 5
    bell_time = D
    while bell_time < total_time:
        if bell_time % (L + 5) < L:
            bell_time += D  
        else:
            return bell_time
    return bell_time 


print(earliest_time_to_hear_bell(N, L, D))