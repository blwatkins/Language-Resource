# Hashes
# A collection of key-value pairs

my_hash = {
	'name' => 'Eric',
  	'age' => 26,
  	'hungry?' => true
}

puts my_hash['name']
puts my_hash['age']
puts my_hash['hungry?']

second_hash = Hash.new # empty hash
second_hash['phone_number'] = '1234567890'
second_hash['name'] = 'Bob'

# Iteration over a Hash

second_hash.each do |x, y|
	puts "#{x}: #{y}"
end

# empty hash with default value for undefined keys
third_hash = Hash.new('default')
