def solution(common):
    answer = 0
    if common[0]+common[2]==common[1]*2 and common[0]*common[1] !=common[2] :
        answer=(common[1]-common[0])+common[len(common)-1]
    else:
        if(common[0]==0):
            return 0
        answer=common[len(common)-1]*(common[1]//common[0])
    return answer