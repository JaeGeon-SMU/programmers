def solution(s):
    answer = 0
    str_list=s.split(' ')
    for i in range(len(str_list)):
        if str_list[i] !='Z':
            answer+=int(str_list[i])
        elif str_list[i] == 'Z':
            answer-=int(str_list[i-1])
    return answer