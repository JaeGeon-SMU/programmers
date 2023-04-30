def solution(price, money, count):
    answer = 0
    i=1
    while i<count+1:
        answer=answer+(price*i)
        i+=1
    if answer>money:
        answer=answer-money
    else:
        answer=0
    return answer