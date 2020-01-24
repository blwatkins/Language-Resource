# Functions

def print_to_10
    for i in 1..10
        puts i
    end
end

print_to_10

puts '-----------------------'

def add(a, b)
    return a + b
end

value = add(15, 2901)
puts value

puts '-----------------------'

# Implicit return
# Ruby functions will return the last evaluated expression

def sub(a, b)
    a - b
end

puts sub(7, 234)

puts '-----------------------'
