def solution(nums):
    cnt=len(nums)/2
    s_num=set(nums)
    if len(s_num)<cnt:
        return len(s_num)
    else:
        return cnt