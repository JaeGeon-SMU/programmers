def solution(A, B):
    answer=0
    if A == B :
        return answer
    for i in range(0,len(A)):
        A=A[len(A)-1:len(A)]+A[0:len(A)-1]
        if A==B:
            return i+1
    answer=-1    
    return answer