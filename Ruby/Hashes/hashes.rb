# Hashes
# A collection of key-value pairs
# undefined keys will have a value of nil

my_hash = {
	'name' => 'Eric',
  	'age' => 26,
  	'hungry?' => true
}

puts my_hash['name']
puts my_hash['age']
puts my_hash['hungry?']

puts '-----------------------'

second_hash = Hash.new # empty hash
second_hash['phone_number'] = '1234567890'
second_hash['name'] = 'Bob'

# Iteration over a Hash

second_hash.each do |x, y|
	puts "#{x}: #{y}"
end

puts '-----------------------'

# Iteration over each key

second_hash.each_key do |k|
    puts k
end

puts '-----------------------'
# Iteration over each value

second_hash.each_value do |v|
    puts v
end

puts '-----------------------'

# empty hash with default value for undefined keys
third_hash = Hash.new('default')

puts third_hash

puts '-----------------------'

# Symbols are typically used for hash keys
# They are immutable
# Only one copy of any symbol exists at any given time --> they save memory
# Faster than using strings as keys

# old version
symbol_hash = {
    :one => 1,
    :two => 2,
    :three => 3
}

puts symbol_hash

puts '-----------------------'

# new version
symbol_hash_2 = {
    one: 1,
    two: 2,
    three: 3
}

puts symbol_hash_2

puts '-----------------------'

# can create a filtered hash using the select block

filtered_hash = symbol_hash.select do |key, value|
    value >= 2
end

puts filtered_hash

puts '-----------------------'

# deleting a key-value pair from a hash
symbol_hash.delete(:two)

puts symbol_hash

puts '-----------------------'
