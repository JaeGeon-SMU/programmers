def solution(s):
    answer = ''
    num_li = list(map(int,s.split()))

    return str(min(num_li))+" "+str(max(num_li))