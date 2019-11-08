# Conditionals

###################
# IF-ELSE
###################

x = 7

if x == 7
    puts "x is 7"
end

###################

if x > 7
    puts "x is greater than 7"
else
    puts "x is not greater than 7"
end
###################

if x > 7
    puts "x is greater than 7"
elsif x < 7
    puts "x is less than 7"
else
    puts "x equals 7"
end

###################
# UNLESS
###################

hungry = false

unless hungry
    puts "I'm not hungry"
else
    puts "Time to eat!"
end

###################

hasFood = false

puts "grocery shopping time" unless hasFood
