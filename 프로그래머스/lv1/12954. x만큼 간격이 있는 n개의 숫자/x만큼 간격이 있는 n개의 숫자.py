def solution(x, n):
    answer = []
    d=x
    for i in range(n):
        answer.append(d)
        d+=x
    return answer