def solution(emergency):
    answer = []
    em_list=sorted(emergency)
    for i in range(len(emergency)):
        for j in range(len(emergency)):
            if em_list[j]==emergency[i]:
                answer.append(len(emergency)-j)
    return answer