def solution(nums):
    li=[]
    answer=0
    for i in range(len(nums)-2):
        for j in range(i+1,len(nums)-1):
            for k in range(j+1,len(nums)):
                li.append(nums[i]+nums[k]+nums[j])
    
    for q in li:
        for w in range(2,q):
            if q%w==0:
                break
            if w==q-1:
                answer+=1
                
    return answer