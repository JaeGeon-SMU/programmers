def solution(num_list, n):
    answer = []
    cnt=0
    for i in range(len(num_list)//n):
        answer.append([])
        for j in range(n):
            answer[i].append(num_list[cnt])
            cnt+=1
    
    return answer