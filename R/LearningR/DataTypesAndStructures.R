# Learning R
# Data Types and Structures

# Numeric Type =====
(a <- 6) # print variable automatically
typeof(a) # "double"

b <- 1.5
typeof(b) # "double"

# Character Type =====
c <- "c"
typeof(c) # "character"

myString <- "this is my string"
typeof(myString) # "character"

# Boolean Type =====
myBoolean = TRUE
typeof(myBoolean) # "logical"

# Vector =====
# a one-dimensional collection of numbers
# can have a vector of any type (numeric, character, boolean)
(v1 <- c(1, 2, 3, 4, 5))
is.vector(v1) # checks if a value is a vector, a single value is a vector

# Matrix =====
m1 <- matrix(c(1, 2, 3, 4, 5, 6), nrow=2)
m1
is.matrix(m1) # checks if a value is a matrix

m2 <- matrix(c("a", "b", "c", "d"), nrow=2, byrow=TRUE)
m2

# Array =====
# first collection is data
# second collection is dimensions of data (rows, columns, tables)
array1 <- array(c(1:24), c(4, 3, 2))
array1
array1[1,3,1]

# Data Frame =====
# allows combination of vectors of the same length
vNumeric <- c(1, 2, 3)
vCharacter <- c("a", "b", "c")
vBoolean <- c(T, F, T)

dataFrame = as.data.frame(cbind(vNumeric, vCharacter, vBoolean))
dataFrame
is.data.frame(dataFrame)

# Coercing Types =====
# conversion/casting
myInt <- as.integer(5)
typeof(myInt) # "integer"

myNum <- as.numeric("17")
typeof(myNum)

myMatrix <- matrix(1:9, nrow=3)
myDataFrame <- as.data.frame(myMatrix)
myDataFrame
is.data.frame(myDataFrame)

# Clean Up ====
rm(list = ls())
