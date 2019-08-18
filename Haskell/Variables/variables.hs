-- Variables

module Main where

a = 6 :: Int
b = 6.534 :: Double
c = 5 / 8 :: Rational
myBoolean = True :: Bool
myChar = 'g' :: Char
myString = "Hello" :: [Char]

main = putStrLn (show (c * 2))
