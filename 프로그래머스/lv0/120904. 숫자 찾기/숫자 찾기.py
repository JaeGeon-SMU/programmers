def solution(num, k):
    answer=0
    list_num=str(num)
    for i in range(len(list_num)):
        if list_num[i]==str(k):
            answer=i+1
            break
        else:
            answer=-1
    return answer