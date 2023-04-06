def solution(array):
    list2=[]
    arr=set(array)
    d=list(arr)
    for i in arr:
        list2.append(array.count(i))

    if list2.count(max(list2))>=2:
        return -1
    else:
        return d[list2.index(max(list2))]