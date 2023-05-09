def solution(t, p):
    i=0
    answer=0
    while i < len(t)-len(p)+1:
        if int(t[i:i+len(p)])<=int(p):
            answer+=1
        i+=1
    return answer