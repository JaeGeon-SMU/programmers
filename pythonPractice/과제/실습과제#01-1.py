import math

#G=6.67408*math.pow(10,-11)
def V(kg,km):
    return math.sqrt(2*G*kg/km)

mars_kg=6.42*math.pow(10,23)
moon_kg=7.3*math.pow(10,22)
saturn_kg=5.68*math.pow(10,26)
mars_km=3396.2*math.pow(10,3)
moon_km=1737.5*math.pow(10,3)
saturn_km=60268*math.pow(10,3)
G=6.67408*math.pow(10,-11)
print(V(mars_kg,mars_km))
print(V(moon_kg,moon_km))
print(V(saturn_kg,saturn_km))

