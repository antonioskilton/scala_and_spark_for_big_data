//Scala Programming Assessment Test
/*
1.) Create Functions to solve the following questions!
The questions are named and then followed by a description.
*/
/*
2.) Check for Single Even:
Write a function that takes in an integer and returns a Boolean indicating whether
or not it is even. See if you can write this in one line!
*/
def singleEven(num:Int): Boolean = if(num%2==0){return true}else{false}
singleEven(2)
singleEven(3)
/*
3.) Check for Evens in a List:
Write a function that returns True if there is an even number inside of a List,
otherwise, return False.
*/
import util.control.Breaks._
def evenInList(nums:List[Int]): Boolean = {
  for(num <- nums){
    if(num%2==0){
      return true
    }
  }
  return false
}



/*
4.) Lucky Number Seven:
Take in a list of integers and calculate their sum. However, sevens are lucky
and they should be counted twice, meaning their value is 14 for the sum. Assume
the list isn't empty.
*/

def sumList(nums:List[Int]): Int = {
  var sum = 0
  for(num <- nums){
    if(num==7){
      sum += 14
    }else{
      sum+= num
    }
  }
  return sum
}

sumList(List(1,2,3,7))

/*
5.) Can you Balance?
Given a non-empty list of integers, return true if there is a place to
split the list so that the sum of the numbers on one side
is equal to the sum of the numbers on the other side. For example, given the
list (1,5,3,3) would return true, you can split it in the middle. Another
example (7,3,4) would return true 3+4=7. Remember you just need to return the
boolean, not the split index point.
*/
var nums = List(7,3,4)

def balanceList(nums:List[Int]): Boolean = {

  var maxIndex = nums.length
  var isSumEqual = false
  var i = 1

  while(i < maxIndex & isSumEqual == false){
    var x = nums slice (0, i)
    var y = nums slice (i, maxIndex)
    isSumEqual = (x.sum == y.sum)
    i += 1
  }

  if(isSumEqual == true){
    return true
  }else{
    return false
  }

}

balanceList(List(1,5,3,3))
balanceList(List(7,3,4))
balanceList(List(7,3,5))
balanceList(List(1,3,400,1))

/*
6.) Palindrome Check
Given a String, return a boolean indicating whether or not it is a palindrome.
(Spelled the same forwards and backwards). Try exploring methods to help you.
*/

def palindromeCheck(word:String): Boolean = return word == word.reverse

palindromeCheck("hannah")
palindromeCheck("hahqie")
