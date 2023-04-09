def solution(my_string):
    ms=my_string.lower()
    list_str=list(ms)
    list_str.sort()
    answer="".join(list_str)
    return answer