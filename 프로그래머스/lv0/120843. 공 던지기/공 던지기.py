def solution(numbers, k):
    answer = 0
    for i in range(k):
        answer+=2
        answer%=len(numbers)
    
    answer-=2
    return numbers[answer]