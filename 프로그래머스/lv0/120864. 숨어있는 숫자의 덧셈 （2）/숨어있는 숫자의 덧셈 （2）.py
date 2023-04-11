import re
def solution(my_string):
    answer = 0
    str2=re.findall(r"\d+",my_string)
    for i in str2:
        answer+=int(i)
    return answer