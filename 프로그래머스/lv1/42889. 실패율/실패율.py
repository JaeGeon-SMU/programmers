def solution(N, stages):
    answer = [0 for u in range(N+1)] 
    for i in stages:
        answer[i-1]+=1
    fail=[]
    for q,j in enumerate(answer):
        if sum(answer[q:])==0:
            fail.append(0)
        else:
            fail.append(j/sum(answer[q:]))
    sort_fail=sorted(fail[:-1],reverse=True)
    ll=[]
    for k in sort_fail:
        ll.append(fail.index(k)+1)
        fail[fail.index(k)]=-1
    return ll