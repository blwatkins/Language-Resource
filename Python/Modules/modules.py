# !/usr/bin/env/ python
# Importing modules

import calculator as c
from my_module import my_function as hey

calculator = c.Calculator()
calculator.add(5)
calculator.add(6)
print(calculator.get_current())

hey()