def solution(answers):
    li=[]
    cnt1=0
    cnt2=0
    cnt3=0
    p1=[1, 2, 3, 4, 5]
    p2=[2, 1, 2, 3, 2, 4, 2, 5]
    p3=[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    for i in range(len(answers)):
        if p1[i%5]==answers[i]:
            cnt1+=1
        if p2[i%8]==answers[i]:
            cnt2+=1
        if p3[i%10] == answers[i]:
            cnt3+=1
    if cnt1>=cnt2 and cnt1>=cnt3:
        li.append(1)
    if cnt2>=cnt1 and cnt2>=cnt3:
        li.append(2)
    if cnt3>=cnt1 and cnt3>=cnt2:
        li.append(3)
    return li