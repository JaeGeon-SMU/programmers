def solution(arr1, arr2):
    return [[arr1[k][q]+arr2[k][q] for q in range(len(arr1[0]))] for k in range(len(arr1))]