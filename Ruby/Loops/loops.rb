# Loops

# Increment Operators
# +=, -=, *=, /=

# while loop
i = 0

while i < 10
    puts i
    i = i + 1
end

puts '-----------------------'

# until loop
# code will repeat UNTIL boolean expression is true
i = 0

until i == 10
    puts i
    i = i + 1
end

puts '-----------------------'

# for loop
for i in 0...10 # does not include 10
    puts i
end

puts '-----------------------'

for i in 0..10 # does include 10
    puts i
end

puts '-----------------------'

# times iterator
5.times do
    puts "hello there."
end

puts '-----------------------'
