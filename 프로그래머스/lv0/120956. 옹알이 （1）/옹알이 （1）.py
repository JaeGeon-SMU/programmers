def solution(babbling):
    answer = 0
    for i in babbling:
        cnt=0
        if "aya" in i:
                cnt+=3
        if "ye" in i:
                cnt+=2
        if "woo" in i:
                cnt+=3
        if "ma" in i:
                cnt+=2
        if len(i) == cnt :
                answer+=1
    return answer