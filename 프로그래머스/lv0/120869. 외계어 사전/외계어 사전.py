def solution(spell, dic):
    answer = 0
    for i in dic:
        sp_check=0
        for j in spell:
            if j not in i :
                answer=2
                break
            elif j in i:
                sp_check+=1
            if sp_check == len(spell):
                answer=1
                break
        if answer ==1 :
            break
            
    
    return answer