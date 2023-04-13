def solution(n):
    answer=1
    while n>0:
        if answer%3==0 or (answer%10)/3==1 or ((answer%100)-(answer%10))/30==1:
            answer+=1
        else:
            answer+=1
            n-=1
    return answer-1