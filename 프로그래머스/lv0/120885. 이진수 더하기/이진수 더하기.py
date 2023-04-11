def solution(bin1, bin2):
    
    a=int(bin1,2)
    b=int(bin2,2)
    ab=str(bin(a+b))
    
    return ab[2:]