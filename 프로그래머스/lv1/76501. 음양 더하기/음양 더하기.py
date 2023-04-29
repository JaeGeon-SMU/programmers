def solution(absolutes, signs):
    answer = 0
    i=0
    while i<len(signs):
        if signs[i]==False:
            answer= answer-absolutes[i]
        else:
            answer = answer+absolutes[i]
        i+=1
    return answer