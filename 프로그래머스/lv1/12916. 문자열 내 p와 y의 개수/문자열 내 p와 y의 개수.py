def solution(s):
    answer = True
    cnt=0
    low_s=s.lower()
    for i in low_s:
        if i=='p':
            cnt+=1
        elif i=='y':
            cnt-=1
    if cnt !=0:
        return False
    return True