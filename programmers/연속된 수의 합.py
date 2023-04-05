import math
def solution(num, total):
    mid_num = math.floor(total/num)
    end_num= mid_num+(num//2)
    start_num=end_num-num+1
    answer = []
    for i in range(num):
        answer.append(start_num)
        start_num+=1

    return answer

a,b=map(int,input().split())
c=solution(a,b)
print(c)