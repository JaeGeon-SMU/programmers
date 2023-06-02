def solution(n, lost, reserve):
    answer = 0
    a=set(reserve)-set(lost)
    b=set(lost)-set(reserve)
    for i in a:
        if i-1 in b:
            b.remove(i-1)
        elif i+1 in b:
            b.remove(i+1)
            
        
    return n-len(b)