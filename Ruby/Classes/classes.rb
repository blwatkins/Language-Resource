# Classes
# Methods are public by default

class Dog

    def initiailize # constructor
        @name = "Spot" #instance variable
        @age = 1;
    end

    def initialize(name) # parameterized constructor
        @name = name
        @age = 1
    end

    public # marks public methods
    def name # getter method
        @name
    end

    private # marks private methods
    def add_age
        @age += 1
    end

end

dog = Dog.new("Carl")

puts dog.name
