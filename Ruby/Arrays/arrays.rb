# Arrays

my_array = [1, 2, 3, 4, 5]

# iterating through an array
my_array.each do |x|
    puts x
end

puts '-----------------------'

# adding an element to an array

my_array.push(6)

my_array << 7

print my_array # output an array

puts ''

puts '-----------------------'

# sorting an array

books = ["Charlie and the Chocolate Factory", "War and Peace", "Utopia", "A Brief History of Time", "A Wrinkle in Time"]
books.sort! # sort books array in place (!)
print books

puts ''

puts '-----------------------'
