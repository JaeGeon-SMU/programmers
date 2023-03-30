grade=input("회원 등급을 적어주세요.")
time=int(input("주차 시간을 적어주세요.(분으로 적어주세요)"))//10*10

if(grade=="플래티넘" or grade=="골드"):
    time-=120
    if(time>0):
        parking_price=100*time
        print(f'주차 요금은{parking_price}원 입니다')
    else:
        print("무료입니다.")
elif(grade=="실버" or grade=="프렌즈"):
    price=int(input("구매하신 금액을 알려주세요."))
    if(price>=30000):
        time-=120
        if(time>0):
            parking_price=100*time
            print(f'주차 요금은{parking_price}원 입니다')
        else:
            print("무료입니다.")
    elif(price>=10000):
        time-=60
        if(time>0):
            parking_price=100*time
            print(f'주차 요금은{parking_price}원 입니다')
        else:
            print("무료입니다.")
else:
    price=int(input("구매하신 금액을 알려주세요."))
    if(price>=50000):
        time-=120
        if(time>0):
            parking_price=100*time
            print(f'주차 요금은{parking_price}원 입니다')  
        else:
            print("무료입니다.")
    elif(price>=30000):
        time-=60
        if(time>0):
            parking_price=100*time
            print(f'주차 요금은{parking_price}원 입니다')
        else:
            print("무료입니다.")

