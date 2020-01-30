# Classes
# Methods are public by default

class Dog
    attr_reader :weight # automatic getter
    attr_writer :age # automatic setter
    attr_accessor :breed # automatic getter and setter

    def initiailize # constructor
        @name = "Spot" #instance variable
        @age = 1;
        @breed = "Golden Retriever"
        @weight = 5;
    end

    def initialize(name) # parameterized constructor
        @name = name
        @age = 1
        @breed = "Golden Retriever"
        @weight = 5;
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
dog.age = 15 # age is writeable, but not readable
dog.breed = "Shitzu" # breed is writeable and readable

puts dog.name
puts dog.weight # weight is readable, but not writeable
puts dog.breed # breed is writeable and readable
