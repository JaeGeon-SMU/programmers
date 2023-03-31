cnt=int(input())
ml=0
for i in range(cnt):
    school=int(input())
    for j in range(school):
        a,b=input().split()
        b=int(b)
        if(b>ml):
            ml=b
            b_school=a
    print(b_school)
