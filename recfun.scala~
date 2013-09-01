package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if (c == 0 && r == 0) 1
    else pascal(c - 1, r -1) + pascal(c, r -1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
      // using a zero sum game, whereby we keep an accumulator which looks at where '(' and ')' come. 
      // If this slips below zero, we must have a ) coming before a ( hence we return the int to lead to false
      // If we get to the end of the char list we return the accumulator
     def iterate(chars: List[Char], accumulate: Int): Int ={
    	// if nothing is passed in return true
	    if (chars.isEmpty || accumulate < 0 ) accumulate
	    // if we get a char then continue on tail
	    else if(chars.head == "(" )
	      iterate(chars.tail, accumulate + 1) 
	    else if(chars.head == ")")
	      iterate(chars.tail, accumulate -1)
	     // if neither are brackets we must continue on
	    else
	      iterate(chars.tail, accumulate)
     }
     // return this if we have a zero accumulator returned - this means it is true
     iterate(chars, 0) == 0
     
   }


  /**
   * Exercise 3
   * Here we want to find the number of ways we can give change from a given number of coins, to the sum money
   * for example. if we have money 4, and coins 1, 2 we can do: 1+1+1+1, 2+2, 1+1+2
   */
  
  def countChange(money: Int, coins: List[Int]): Int = 
    // edge case if money is zero, return one, i.e. there is only a single way to give change - nothing!
    if (money == 0) 1
    // if money is negative, i.e. invalid param of coins are empty we cannot give any change!
    else if(money < 0 || coins.isEmpty) 0
    
    // if head of coins is less then or equal to money we deduct this change and continue on through the list
    // if we find coin in list is greater than money we continue looking at tail of list
    else 
      countChange(money - coins.head, coins) + countChange(money, coins.tail)

}
