// val immutable
// var mutable

println("Hello!")
/* Types:
Double
Float
Long
Int
Short
Byte
Char
Boolean
Unit
String
*/

val piDouble: Double = 3.14 // Double is more precise than float
val fourHearts: Int = 4
val handBusts: Boolean = true
val symbol: String = "Hola"
val twoClubs: Int = 2
val threeClubs: Int = 3
val fourClubs: Int = 4



var aceSpades: Int = 1
aceSpades = 11

var aceClubs: Int = 1
var aceDiamonds: Int = 1
var aceHearts: Int = 1
var aceSpades: Int = 1


// Create a mutable variable for player A (Alex)
var playerA = "Alex"

// Change the point value of A♦ from 1 to 11
aceDiamonds = 11

// Calculate hand value for J♣ and A♦
println(jackClubs + aceDiamonds)

30>20

// FUNCTIONS
def bust(hand: Int): Boolean ={
	hand>21
}

// Is the same
def bust(hand: Int): = {
	hand>21
}


println(bust(20))
println(bust(22))

println(bust(20+30))



def maxHand(handA: Int, handB: Int): Int = {
  if (handA > handB) handA
  else handB
}

// Calculate hand values
var handPlayerA: Int = queenDiamonds + threeClubs + aceHearts + fiveSpades
var handPlayerB: Int = kingHearts + jackHearts

// Find and print the maximum hand value
println(maxHand(handPlayerA, handPlayerB))


// Arrays

// Mutable and Inmmutable

val players = Array("Alex", "Chen", "Marta")

val players = new Array[String](3)



val players: Array[String] = new Array[String](3)
players(0) = "Alex"
players(1) = "Chen"
players(2) = "	Marta"

players(0) = "Other"



// Create and parameterize an array for a round of Twenty-One
val hands: Array[Int] = new Array[Int](3)

// Initialize the first player's hand in the array
hands(0) = tenClubs + fourDiamonds

// Initialize the second player's hand in the array
hands(1) = nineSpades + nineHearts

// Initialize the third player's hand in the array
hands(2) = twoClubs + threeSpades



// Create, parameterize, and initialize an array for a round of Twenty-One
val hands = Array(tenClubs + fourDiamonds,
                  nineSpades + nineHearts,
                  twoClubs + threeSpades)


// Initialize player's hand and print out hands before each player hits
hands(0) = tenClubs + fourDiamonds
hands(1) = nineSpades + nineHearts
hands(2) = twoClubs + threeSpades
hands.foreach(println)

// Add 5♣ to the first player's hand
hands(0) = hands(0) + fiveClubs

// Add Q♠ to the second player's hand
hands(1) = hands(1) + queenSpades

// Add K♣ to the third player's hand
hands(2) = hands(2) + kingClubs

// Print out hands after each player hits
hands.foreach(println)




val mixedTypes = new Array[Any](3)
mixedTypes(0) = "Hello"
mixedTypes(1) = 500
mixedTypes(2) = true

mixedTypes



// Lits immutable
val players = List("Alex", "Chen", "Marta")

//METHODS
.drop()
.mkString(", ")
.length
.reverse


//Concatenation

val playersA = List("Hola")
val playersB = List("Juan")

val allPlayers = playersA ::: playersB
 

 // Initialize a list with an element for each round's prize
val prizes = List(10, 15, 20, 25, 30)
println(prizes)

// Prepend to prizes to add another round and prize
val newPrizes = 5 :: prizes
println(newPrizes)


// Initialize a list with an element each round's prize
val prizes = 10 :: 15 :: 20 :: 25 :: 30 :: Nil
println(prizes)

// The original NTOA and EuroTO venue lists
val venuesNTOA = List("The Grand Ballroom", "Atlantis Casino", "Doug's House")
val venuesEuroTO = "Five Seasons Hotel" :: "The Electric Unicorn" :: Nil

// Concatenate the North American and European venues
val venuesTOWorld = venuesNTOA ::: venuesEuroTO




// Point value of a player's hand
val hand = sevenClubs + kingDiamonds + threeSpades

// Congratulate the player if they have reached 21
if (hand == 21) {
  println("Twenty-One!")
}




// Point value of a player's hand
val hand = sevenClubs + kingDiamonds + threeSpades

// Inform a player where their current hand stands
val informPlayer: String = {
  if (hand > 21)
    "Bust! :("
  else if (hand == 21) 
    "Twenty-One! :)"
  else
    "Hit or stay?"
}

// Print the message
print(informPlayer)



// Find the number of points that will cause a bust
def pointsToBust(hand: Int): Int = {
  // If the hand is a bust, 0 points remain
  if (bust(hand))
    0
  // Otherwise, calculate the difference between 21 and the current hand
  else
    21 - hand
}

// Test pointsToBust with 10♠ and 5♣
val myHandPointsToBust = pointsToBust(tenSpades + fiveClubs)
println(myHandPointsToBust)


var i =0
var rep =3
while( i< rep){
	println("Hip")
	i = i+1
}



var i = 0
var hands = Array(17,23,12)
while (i<hands.length){
	println(bust(hands(i)))
	i+=1
}



// Define counter variable
var i = 0

// Define the number of loop iterations
val numRepetitions = 3

// Loop to print a message for winner of the round
while (i < numRepetitions) {
  if (i < 2)
    println("winner")
  else
    println("chicken dinner")
  // Increment the counter variable
  i = i + 1
}


// Define counter variable
var i = 0

// Create list with five hands of Twenty-One
var hands = List(16, 21, 8, 25, 4)

// Loop through hands
while (i < hands.length) {
  // Find and print number of points to bust
  println(pointsToBust(hands(i)))
  // Increment the counter variable
  i += 1
}



// Find the number of points that will cause a bust
def pointsToBust(hand: Int) = {
  // If the hand is a bust, 0 points remain
  if (bust(hand))
    println(0)
  // Otherwise, calculate the difference between 21 and the current hand
  else
    println(21 - hand)
}

// Create list with five hands of Twenty-One
var hands = List(16, 21, 8, 25, 4)

// Loop through hands, finding each hand's number of points to bust
hands.foreach(pointsToBust)