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

# removing an element from an array

last = my_array.pop

print my_array

puts ''

puts "last = #{last}"

puts '-----------------------'


# sorting an array

books = ["Charlie and the Chocolate Factory", "War and Peace", "Utopia", "A Brief History of Time", "A Wrinkle in Time"]
books.sort! # sort books array in place (!)
print books

puts ''

puts '-----------------------'

# performing an action on each array item
# to mutate array in-place, use collect!
# can also use the map and map! methods

doubled_my_array = my_array.collect do |x|
    x * 2
end

print doubled_my_array

puts ''

puts '-----------------------'
