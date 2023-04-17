def solution(polynomial):
    x_num=0
    n_num=0
    x_str=""
    answer=""
    p_str=polynomial.split()
    for i in p_str:
        if 'x' == i :
            x_str+="1x"
        elif 'x' in i:
            x_str+=i
    x_coef=x_str.split('x')
    for j in x_coef:
        if j.isnumeric():
            x_num+=int(j)
    for k in p_str:
        if k.isnumeric():
            n_num+=int(k)
    
    if x_num == 0:
        answer+=str(n_num)
    elif n_num == 0 :
        if x_num == 1:
            answer+="x"
        else:
            answer+=str(x_num)+"x"
    else :
        if x_num == 1:
            answer+="x + " + str(n_num)
        else:
            answer+=str(x_num) + "x + " + str(n_num)
    return answer