import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source


object SecondScala {
  def main(args: Array[String]){
  var i = 0
  
    def printPrimes(){
      val primeList = List(1,3,5,7,11)
      for (i <- primeList){
        if(i == 11 ){
        	return
        }

        if (i != 1){
        	println(i)
        }

      }
    }
    
    printPrimes
    numberGuess

    val name = "josep"
    val age = 37
    val weight = 199.2

    println(s"My name is $name")
    println(f"I am age ${age + 1} and weight $weight%.2f")


    val randSent = "I saw a dragon fly by"
    
    println("3rd Index : " + randSent(3))

    println("3rd Index : ".concat(randSent))
    println(randSent.indexOf("saw"))
  }

  def numberGuess(){
    var numberGuess = 0 

    do{
    	print("Guess a number ")
    	numberGuess = readLine.toInt

    } while (numberGuess != 7)

    printf("You guessed the secret number %d\n", 7)

  }

}