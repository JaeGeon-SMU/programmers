def solution(sides):
    answer = 0
    i=1
    while max(sides)+min(sides)>i:  
            if max(sides)>=i>(max(sides)-min(sides)):
                answer+=1
            elif max(sides)+min(sides)>i and i>=max(sides):
                answer+=1
            i+=1
    return answer