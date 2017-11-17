/*
1)
Can you figure out what method you can use to find out if the list:
List(1,2,3,4) contains the number 3?
*/

var TestList = List(1,2,3,4,5)
TestList.contains(3)
TestList contains 3

/*
2)
How can you add all the elements of the previous list?
*/
TestList.sum

/*
3)
Create an Array of all the odd numbers from 0 to 15
*/
Array.range(1,16,2)
Range(1,16,2)
/*
4)
What are the unique elements in the list:
List(2,3,1,4,5,6,6,1,2)?
*/
var TestList2 = List(2,3,1,4,5,6,6,1,2)
TestList2.toSet
/*
5)
Create a mutable map that maps together Names to Ages. It should have the following key value pairs:
Sammy, 3
Frankie, 7
John, 45
*/
var TestMap = Map(("Sammy", 3), ("Frankie", 7), ("John", 45))
//5a) Print out all the keys
TestMap.keys
//5b) Add the key value pair ("Mike",27)
TestMap += ("Mike" -> 27)

TestMap
