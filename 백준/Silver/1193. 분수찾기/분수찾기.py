def get_fraction_position(X):
    current_sum = 1
    level = 2
    is_top_direction = False
    
    while current_sum < X:
        current_sum += level
        level += 1
        is_top_direction = not is_top_direction
        
    position = current_sum - X
    position += 1
    
    if is_top_direction:
        return f"{level - position}/{position}"
    return f"{position}/{level - position}"

X = int(input())
print(get_fraction_position(X))