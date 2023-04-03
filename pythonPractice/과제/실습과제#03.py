regi_num=input()
birth=0
sign=1
if(len(regi_num)!=14):
    print("유효하지 않습니다.")
    sign=0
elif(regi_num[6]!='-'):
    print("유효하지 않습니다.")
    sign=0

if int(regi_num[0:2])>=0 and int(regi_num[0:2])<=23:
    birth=20
else:
    birth=19

#윤년
if(regi_num[2:4]=='02' and regi_num[4:6]=='29'):
    birth_year=int(str(birth)+regi_num[0:2])
    if(birth_year%400 != 0):
        if(birth_year%100 == 0 or birth_year%4 != 0):
            print("유효하지 않습니다.")
            sign=0
if regi_num[7:8]=='1' or regi_num[7:8]=='2':
    if(birth!=19):
        print("유효하지 않습니다.")
        sign=0
elif regi_num[7:8]=='3' or regi_num[7:8]=='4':
    if(birth!=20):
        print("유효하지 않습니다.")
        sign=0
if(sign == 1):
    print("유효합니다.")
    

    
