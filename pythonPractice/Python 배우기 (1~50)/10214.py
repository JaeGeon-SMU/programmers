cnt=int(input())
korea=yonsei=0
for i in range(cnt):
    for j in range(9):
        a,b=map(int,input().split())
        if(a>0):
            yonsei+=a
        if(b>0):
            korea+=b
    if(yonsei>korea):
        print("Yonsei")
    elif(yonsei<korea):
        print("Korea")
    else:
        print("Draw")