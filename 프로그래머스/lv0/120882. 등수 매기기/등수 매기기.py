def solution(score):
    answer = []
    sum_score=[]
    for i in score:
        sum_score.append(sum(i))
    sum_score.sort(reverse=True)
    for j in score:
        answer.append(sum_score.index(sum(j))+1)
    return answer