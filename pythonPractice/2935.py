'''a,b,c = map(int,input().split())

if(a>=b):
    second = b
    if(b<=c):
        second = c
    if(c>=a):
        second = a
else:
    second = a
    if(a<c):
        second = c
    if(c>=b):
        second = b
print(second)'''
num_list = list(map(int, input().split()))
num_list.sort()
print(num_list[1])