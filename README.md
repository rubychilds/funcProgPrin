# Functional Principles of Programming with Scala

This repository consists of my solutions to the assignments given in the [Coursera](https://www.coursera.org) course Functional Programming Principles in Scala. I would highely advise against copying it if doing such course. I have simply placed mine here for reference and to illustrate thought processes.

Note the gitignore file has been copied from [Github's useful gitignore templates](https://github.com/github/gitignore)

## Assignment 1
Focus on recursion
###Exercise 1
Returns an element at column c and row r
###Exercise 2
Looks at whether a string has parentheses balance. For example. ')(' cannot be balanced, '(hello)' is balanced. The solution looks at using a zero sum game, whereby we increase an accumulator by +1 for '(', as this is expected to come first, and reduce the accumulator by -1 for ')'. If the acummulator becomes negative, then we deduce ')' has become before '(' and so is unbalanaced. We treat the string as a List of chars, by passing List[char] We check on the list by recursively calling the function on the tail of the list once the head has been dealt with.
###Exercise 3
This looks at the number of ways one can give change from a list of coins to total a amount of money. The list items can be reused as many times as desired. In order to do this we consider edge cases, when no coins are given, nor money. Then we look at the case when a coin maybe greater than the money amount or less than in which it is used as part of the change.

## Assignment 2
Focus on understanding concepts of Sets such as union, intersection and difference. Further to this we continue on to look at transformations and queries of sets, such as writing forall which tests if every element in a set has a property p

###Exercise 1
Union, Intersection and Difference

###Exercise 2
Implemetation of forall, exists and map. Deals with iteration over set to check property of elements and to tansform elements.

##Assignment 3
Mainly focuses on object-oriented sets through the use of TweetSet, TweetList and a Tweet. 
###Exercise 1
Involves implemenation of filter, which filters a TweetSet according to a predicate p. Uses helper function filterAcc to accumulate the tweets that have property p.

###Exercise 2
Union of two TweetSets: this.union(that). Whereby we look at if this is empty, to return that. If nonEmpty then we must look at right and left TweetSets of this and include the additional element. Defined as abstract in class TweetSet but implemented in NonEmpty and Empty.

###Exercise 3
Returns a TweetList given a TweetSet in descending order of retweets. Recursive helper function whereby we get the top element first and recall the helper function on the rest of the TweetSet accumulating the results in a TweetList. This was implemented in the class TweetSet, but could take out the helper function to sit in either subclasses.

###Exercise 4
Within this function, we get all tweets and the filter accordingly to whether they contain Google or Apple Buzzwords. These lists are unioned together then we apply descendingByRetweets to order by number of retweets.

##Assignment 4
[Huffman code](http://en.wikipedia.org/wiki/Huffman_coding) implementation. Focus on Pattern Matching. 

###Exercise 2
Involves development of helper functions for createCodeTree which takes a list of characters and returns a CodeTree. Times counts the occurance of characters in a list; makeOrderedLeafLists returns list of leaves in ascending weight order; singleton determines if there is a single tree in List(CodeTree); combine removes trees with lowerweights and recombines them to pre-existing trees; until takes functions singleton and combine until returning a list of a single tree.

###Exercise 3
Decode method which returns List(Char) given a string of bits and a TreeCode. This acts recursively to iterate through the tree until reaching a leaf whereby it returns the char and continues on with decoding. 

###Exercise 4




