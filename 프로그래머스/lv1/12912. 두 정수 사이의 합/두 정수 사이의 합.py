def solution(a, b):
    answer = 0
    if a==b:
        return a
    answer=(a+b)*abs(max(a,b)-min(a,b)+1)/2
    return answer