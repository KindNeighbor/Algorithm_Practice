def solution(participant, completion):
    participant.sort()
    completion.sort()
    answer = ''

    for i in range(len(participant)):
        if i == len(completion): 
            answer = participant[i]
            break
        elif participant[i] != completion[i]:
            answer = participant[i]
            break
    
    return answer