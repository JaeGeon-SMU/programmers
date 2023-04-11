def solution(array, n):
    answer = 0
    array.sort()
    comp=abs(array[0]-n)
    answer=array[0]
    if comp ==0:
        return array[0]
    for i in array:
        if abs(n-i)<comp :
            comp=abs(n-i)
            answer=i
            if(comp == 0 ):
                return answer
    return answer