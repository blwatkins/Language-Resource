my_num = 25
my_boolean = true
my_string = "Ruby"

# output values
puts my_num # puts -> adds a new line
print my_string # print -> does not add new line

puts ''
puts '-----------------------'

# Conditional Assignment
# Only set variable if it has no value

my_string ||= 'Ruby is cool'
puts my_string

my_value = nil
my_value ||= 45
puts my_value
