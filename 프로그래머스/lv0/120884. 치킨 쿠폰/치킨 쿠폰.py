def solution(chicken):
    answer = chicken
    coupon= chicken
    while coupon>10:
        answer+=coupon//10
        coupon=coupon//10+coupon%10
        
    if(coupon==10):
        answer+=1
    answer-=chicken    
    return answer