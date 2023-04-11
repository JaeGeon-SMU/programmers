def solution(s):
    answer = ''
    set_s=set(s)
    for i in set(s):
        if s.count(i) == 1 :
            answer+=i
    l_answer=sorted(list(answer))
    answer=''.join(l_answer)
    return answer