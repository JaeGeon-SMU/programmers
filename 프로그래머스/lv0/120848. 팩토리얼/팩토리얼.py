def solution(n):
    answer = 1
    i=1
    while True:
        if answer>n:
            break
        i+=1
        answer*=i
    return (i-1)