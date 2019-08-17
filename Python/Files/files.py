# !/usr/bin/env/ python
# File Input and Output

import random as r

# reading a file
file_to_read = open("text.txt", "r")
lines = file_to_read.readlines()
file_to_read.close()

for line in lines:
    print(line)

my_list = [1, 2, 3, 4, 5]
my_string = "My name is... "
num = r.choice(my_list) # return a random element from my_list
final_string = my_string * num

# writing to a file
file_to_write = open("writtenFile.txt", "w")
file_to_write.write(final_string)
file_to_write.close()
