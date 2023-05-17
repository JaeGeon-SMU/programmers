def solution(participant, completion):
    hashdict={}
    sumhash=0
    
    for i in participant:
        hashdict[hash(i)]=i
        sumhash+=hash(i)
    
    for j in completion:
        sumhash-=hash(j)
    return hashdict[sumhash]
        