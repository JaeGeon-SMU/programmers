def solution(a, b):
    answer = 1
    a_list=soinsu(a)
    b_list=soinsu(b)
    c_list=soinsu(b)
    
    for i in b_list:
        if i in a_list:
            a_list.remove(i)
            c_list.remove(i)
    
    for j in c_list:
        if j!=2 and j!=5:
            answer=2
            break
    return answer

def soinsu(q):
    soinsu_list=[]
    i=2
    while q>1:
        if q%i == 0 :
            q=q//i
            soinsu_list.append(i)
        else:
            i+=1
    return soinsu_list