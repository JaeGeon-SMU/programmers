def solution(n):
    answer = []
    sosu=[2]
    for i in range(2,n+1):
        j=2
        while i>j:
            if i%j==0:
                break
            elif i==j+1:
                sosu.append(i)
            j+=1

        for r in sosu:
            if r>n :
                break
            elif n%r == 0 and (r not in answer):
                answer.append(r)
            
    return answer