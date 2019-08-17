# !/usr/bin/env python
# Lists

my_numbers = [1, 2, 3, 4, 5, 6]

my_letters = []

my_letters.append('a')
my_letters.append('b')

# appending multiple values
my_numbers += [7, 8, 9, 10]

# length of a list
list_length = len(my_letters)

# printing lists
print(my_letters)

for number in my_numbers:
    print(number)

# splicing and array
middle_numbers = my_numbers[3:8]

# deleting by index
del my_numbers[5]

# clearing a list
my_numbers[0:] = []

# zipping lists
letters = ['a', 'b', 'c']
numbers = [1, 2, 3]
tuples = zip(letters, numbers)
print(tuples)