# !/usr/bin/env/ python
# Class Defintion

class MyClass:
    variable = 6

    # constructor
    def __init__(self, variable):
        self.variable = variable

    # string conversion
    def __str__(self):
        class_string = "This is my class"
        return class_string

    # self parameter = first parameter passed to any class method
    def myFunction(self):
        print("Howdy")

    def add2(self, num):
        return num + 2

my_object = MyClass(89)
var = my_object.variable
my_object.myFunction()
number = my_object.add2(9)

your_object = MyClass(90)
your_object_string = str(your_object)
print(your_object_string)

# getting class name
your_object_clas_name = your_object.__class__.__name__
