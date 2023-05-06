def solution(arr):
    answer = []
    j=1
    answer.append(arr[0])
    while j<len(arr):
        if arr[j-1] !=arr[j]:
            answer.append(arr[j])
        j+=1
    return answer