# !/usr/bin/env pyhton
# Loops

# using the range function
print "printing 0-5";

for number in range(5):
    print "  " + str(number) # str() converts an int to a string

print "printing 10 - 200, increasing by 25"

for number in range(10, 200, 25): # range(start, end, increment)
    print "  " + str(number)

print "printing 200 - 0 decreasing by 25"

for number in range(200, 0, -25):
    print "  " + str(number)

# using continue and break
print "printing 0 - 1000, skipping 6, stopping at 50"

for number in range(1000):

    if number == 6:
        continue
    elif number == 50:
        break

    print "  " + str(number)

# while loops
print "printing 1 - 10 with a while loop"

s = 1
while s < 10:
    print "  " + str(s)
    s += 1

