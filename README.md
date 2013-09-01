# Functional Principles of Programming with Scala

This repository consists of my solutions to the assignments given in the (Coursera)[https://www.coursera.org] course Functional Programming Principles in Scala. I would highely advise against copying it if doing such course. I have simply placed mine here for reference and to illustrate thought processes.

## Assignment 1
Focus on recursion
###Exercise 1
Returns an element at column c and row r
###Exercise 2
Looks at whether a string has parentheses balance. For example. ')(' cannot be balanced, '(hello)' is balanced. The solution looks at using a zero sum game, whereby we increase an accumulator by +1 for '(', as this is expected to come first, and reduce the accumulator by -1 for ')'. If the acummulator becomes negative, then we deduce ')' has become before '(' and so is unbalanaced. We treat the string as a List of chars, by passing List[char] We check on the list by recursively calling the function on the tail of the list once the head has been dealt with.
###Exercise 3
This looks at the number of ways one can give change from a list of coins to total a amount of money. The list items can be reused as many times as desired. In order to do this we consider edge cases, when no coins are given, nor money. Then we look at the case when a coin maybe greater than the money amount or less than in which it is used as part of the change.

## Assignment 2
to be completed
