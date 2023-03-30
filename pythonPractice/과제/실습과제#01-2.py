import math

h=15
r=5
def S(h,r):
    a=math.sqrt(h*h+r*r)
    Cone_S=math.pi*r*(a+r)
    return Cone_S

print(S(15,5))