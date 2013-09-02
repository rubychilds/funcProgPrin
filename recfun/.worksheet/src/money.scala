object money {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(623); 
  def countChange(money: Int, coins: List[Int]): Int =
    // edge case if money is zero, return one, i.e. there is only a single way to give change - nothing!
    if (money == 0) 1
    // if money is negative, i.e. invalid param of coins are empty we cannot give any change!
    else if(money < 0 || coins.isEmpty) 0
    
    // if head of coins is less then or equal to money we deduct this change and continue on through the list
    // if we find coin in list is greater than money we continue looking at tail of list
    else
      countChange(money - coins.head, coins) + countChange(money, coins.tail);System.out.println("""countChange: (money: Int, coins: List[Int])Int""");$skip(29); val res$0 = 
	
	
 	countChange(0, List());System.out.println("""res0: Int = """ + $show(res$0))}

}
