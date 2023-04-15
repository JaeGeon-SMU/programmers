def solution(id_pw, db):
    answer = ''
    for i in db:
        if id_pw[0] in i:
            if id_pw[1] in i:
                answer="login"
            else:
                answer="wrong pw"
                break
        else:
            answer="fail"
    return answer