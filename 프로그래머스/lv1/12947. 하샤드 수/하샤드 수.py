def solution(x):
    answer = True
    sum=0
    a=list(str(x))
    for i in a:
        sum+=int(i)
    if x%sum !=0:
        answer=False
    return answer