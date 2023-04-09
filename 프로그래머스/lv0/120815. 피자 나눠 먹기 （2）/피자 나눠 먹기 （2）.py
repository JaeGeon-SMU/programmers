def solution(n):
    answer=0
    i=1
    while True:
        if (i*6)%n ==0 :
            answer=i
            break
        i+=1
    return answer