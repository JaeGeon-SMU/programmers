def solution(n):
    answer = []
    while n>=3:
        answer.append(n%3)
        n=n//3
    answer.append(n)
    d=answer[::-1]
    j=1
    qq=0
    for i in d:
        qq+=int(i)*j
        j*=3
    return qq