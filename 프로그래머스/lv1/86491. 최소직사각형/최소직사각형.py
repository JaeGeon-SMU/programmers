def solution(sizes):
    answer = 0
    li = [sorted(i)[0] for i in sizes]
    li2= [sorted(i)[1] for i in sizes]
    return max(li2)*max(li)