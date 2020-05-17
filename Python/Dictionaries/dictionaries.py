# !/usr/bin/env python
# Dictionaries

# creating dictionaries
my_dictionary = dict()
print(my_dictionary)

phone_numbers = {"Bob": 123, "George": 456, "Phil": 789, "Mick": 123, "Bill": 456}

letters = {}

letters["A"] = 1

# iterating over keys
names = phone_numbers.keys()

for name in names:
    print(name)

for key in phone_numbers:
    print(key)


# iterating over values
numbers = phone_numbers.values()

for num in numbers:
    print(num)

# iterating over keys and values
for key, value in phone_numbers.items():
	print(key + ': ' + str(value))

# in keyword checks for existence of key in dictionary
if "B" in letters:
    letters["B"] = 50
else:
    letters["B"] = 2

if "James" not in phone_numbers:
    phone_numbers["James"] = 901

# number of key-value pairs
number_of_pairs = len(letters)

# deleting a key-value pair
del phone_numbers["Phil"]

# copying a dictionary
new_phone_book = phone_numbers.copy()

# clearing the dictionary
new_phone_book.clear()

# merge a dictionary
new_phone_book = {"House": 473, "You": 834, "Him": 382}

# no change to new_phone_book, only alters phone_numbers
phone_numbers.update(new_phone_book)

# create list of key-value tuple pairs
key_value_list = new_phone_book.items()
print(key_value_list)

