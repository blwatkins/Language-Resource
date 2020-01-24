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

# the include method checks to see if a string contains a substring
if my_string.reverse!.downcase!.include? "this"
    puts "yes"
end

# string replacement
replaced = my_string.gsub(/this/, "that")
puts replaced

my_string = 'my string is the best'
words = my_string.split(' ') # split returns an array of strings

words.each do |s|
    puts s
end

# concatenation

first_string = 'this is a '
second_string = 'string'
puts first_string + second_string
first_string << second_string # first_string += second_string also works!
puts first_string
