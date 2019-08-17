# !/usr/bin/env python
# Timing function execution

import timeit
import time
from math import cos, sin, radians, factorial, sqrt

def myFunction(x):
    valList = []
    for index in range(200):
        valList.append(cos(sin(radians(x * index))))
        valList.append(sqrt(cos(sin(radians(x * index)))))
    for index in range(75):
        valList.append(factorial(x + index))
    valList = []

# timing a funciton using time()
# returns time in seconds
start = time.time()
myFunction(300)
end = time.time()
total_time = end-start
print("myFunction took " + str(total_time) + " seconds")


# timing a function using timeit();
statement = '''
for index in range(200):
    valList.append(cos(sin(radians(x * index))))
    valList.append(sqrt(cos(sin(radians(x * index)))))
for index in range(75):
    valList.append(factorial(x + index))
valList = []
'''

setup_statement = 'from math import cos, sqrt, sin, factorial, radians; x = 300; valList = []'

t = timeit.Timer(statement, setup_statement, timeit.default_timer)
time_to_exectute = t.timeit(1)
print("myFunction took " + str(time_to_exectute) + " seconds")
