# !usr/bin/env python

# Variables

def main():
    my_int = 45
    my_float = 49.234
    my_string = 'This is my string'
    my_other_string = "This is my other string"
    print('myInt =', my_int)
    print(type(my_float)) # access the type of a variable

    # conversion functions
    my_string_2 = str(my_int)
    my_int_2 = int(my_float)
    my_float_2 = float("46.7")

    print("my_float_2 * 5 =", my_float_2 * 5);
    print("my_string * 2 =", my_string * 2);

if __name__ == '__main__':
    main()
