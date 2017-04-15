import scala.collection.mutable.ArrayBuffer

object ArrayScala {
	def main(args: Array[String]){
   
      val favNums = new Array[Int](20)

      val friends = Array("Tom", "Jerry")

      friends(0) = "Michael"	

      println(friends(0))

      val friends2 = ArrayBuffer[String]()

      friends2.insert(0,"Larry")

      friends2 += "Mark"

      friends2 ++= Array("Susy","Paul")

      friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")

      friends2.remove(1,2)

      var friend : String = " "

      for(friend <- friends2)
        println(friend)

      for(j <- 0 to favNums.length - 1){
      	favNums(j) = j 
      	println(favNums(j))
      }

      val favNumsTimes2 = for(num <- favNums) yield 2 * num

      favNumsTimes2.foreach(println)

      val favNumsDiv4 = for(num <- favNums if num % 4 == 0) yield num

      favNumsDiv4.foreach(println)

      var multTable = Array.ofDim[Int](10,10)

      for(i <- 0 to 9){
        for (j <- 0 to 9){
          multTable(i)(j) = i * j 
        }
      }
      
      for(i <- 0 to 9){
        for (j <- 0 to 9){
          printf("%d : %d = %d\n",i,j,multTable(i)(j))
        }
      }  

      println("Sum : " + favNums.sum)
      println("Max : " + favNums.max)
      println("Min : " + favNums.min)

      var sortedNums  = favNums.sortWith(_>_)

      println(sortedNums.deep.mkString(", "))



	}
}