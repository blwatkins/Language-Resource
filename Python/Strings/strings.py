# !/usr/bin/env python
# Strings

my_string = "This is a string"
your_string = 'This is also a string'
their_string = str(7.324342) # string conversion function

my_name = "Brittni"

greeting = "Hi "


# string concatenation
full_greeting = greeting + my_name

# string multiplication
double_name = my_name * 2

# accessing a character by index
firstInitial = my_name[0]

# accessing a character by negative index
lastLetter = my_name[-1]

# in keyword
ice_cream = "ice cream"

if "cream" in ice_cream:
    print "Yay!"

# counting number of characters
length = len(my_name)

# multi line strings
long_string = """this is my
multi-line super
long string"""

lower_case_name = my_name.lower()
upper_case_name = my_name.upper()

# capitalize first letter of string
capitalized = ice_cream.capitalize()

# combining strings and variables
age = 21
name = "George"
day = "Thursday"

# %s for strings, %d for numbers
full_string = "Hello. My name is %s. I am %d years old. Today is %s"%(name, age, day)

# slicing
date = "Today is Tuesday"
middle_of_date = date[3:11]
beginning_of_date = date[:7]
end_of_date = date[7:]

# iterating over characters
for character in date:
    print character
