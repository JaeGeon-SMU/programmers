def solution(n, arr1, arr2): 
    li=[bin(arr1[i]|arr2[i])[2:].zfill(n) for i in range(n)]
    i=0
    j=0
    while i<n:
        while j<n:
            if li[i][j] == '1':
                li[i]=li[i].replace('1','#',1)
            elif li[i][j] == '0':
                li[i]=li[i].replace('0',' ',1)
            j+=1
        j=0
        i+=1
    return li