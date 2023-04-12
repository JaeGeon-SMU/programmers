def solution(my_string):
    answer = 0
    ms=my_string.split(' ')
    answer+=int(ms[0])
    for i in range(1,len(ms)):
        if ms[i-1] =='+':
            answer+=(int(ms[i]))
        elif ms[i-1]=='-':
            answer-=(int(ms[i]))
    return answer