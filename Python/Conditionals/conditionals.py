# !/usr/bin/env python

def atTheZoo(animal):

    if animal == "Lion":
        print("Rawr")

    elif animal == "Elephant":
        print("Zoo")

    else:
        print("no animals")

my_variable = "Elephant"
atTheZoo(my_variable)

my_variable = "Lion"
atTheZoo(my_variable)

my_variable = "Seal"
atTheZoo(my_variable)

hasCookies = True
hasMilk = False

if hasCookies and hasMilk:
    print("Happy Day!")

elif hasCookies and not hasMilk:
    print("That's okay")

elif hasCookies or hasMilk:
    print("Something's missing")

else:
    print("Oh well")