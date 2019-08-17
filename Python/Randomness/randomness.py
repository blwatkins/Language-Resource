# !/usr/bin/env/ python
# Randomness

import random as rand

# getting a random value between 0 and 1
random_float = rand.random()

# getting a random integer in a range
# function returns an inclusive range [a, b]
random_integer = rand.randint(90, 300)

# getting a random element from a list (uniform distribution)
my_numbers = [10, 78, 45, 90, 29]
chosen_number = rand.choice(my_numbers)
