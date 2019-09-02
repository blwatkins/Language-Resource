# The following functions do not change the string itself
# They return a new string

# find the length of a string
puts "Bob".length

# reverse the string
puts "Bob".reverse

# uppercase and lowercase conversions
puts "Bob".upcase
puts "Bob".downcase
puts "Bobbert".reverse.upcase

# capitalize only first letter of the string, lowercase all others
puts "this is a string".capitalize

# to change the string in place, use the ! operator
my_string = "This is my string"
my_string.reverse!.upcase!
puts my_string