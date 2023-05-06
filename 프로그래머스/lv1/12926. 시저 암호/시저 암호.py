def solution(s, n):
    answer = ''
    a=list(s)
    for i in a:
        if i != ' ':
            q=ord(i)+n
            if 65<=ord(i)<=90:
                if q>90:
                    q=q-26
                    answer+=chr(q)
                else:
                    answer+=chr(q)
            else:
                if q>122:
                    q=q-26
                    answer+=chr(q)
                else:
                    answer+=chr(q)

        else:
            answer+=i
    
    return answer