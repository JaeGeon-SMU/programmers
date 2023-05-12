def s(arr,i,j,k):
    li=sorted(arr[i-1:j])
    return li[k-1]

def solution(array, commands):
    answer = []
    for i in commands:
        answer.append(s(array,i[0],i[1],i[2]))
    return answer



