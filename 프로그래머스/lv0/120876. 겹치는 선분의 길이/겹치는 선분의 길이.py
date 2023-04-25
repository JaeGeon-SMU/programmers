def solution(lines):
    answer = 0
    all_point=[0 for _ in range(200)]
    for i in lines:
        for j in range(i[0],i[1]):
            all_point[j+100]+=1
    answer+=all_point.count(2)
    answer+=all_point.count(3)
    return answer