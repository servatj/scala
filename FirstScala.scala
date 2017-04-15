object FirstScala {
	def main(args: Array[String]){
	  

  // traditional loops 
	  var i = 0 

	  while(i <= 10){
	  	println(i)
	  	i += 1
	  }

	  var b = 0 

      do {
      	println(b)
      	b += 1 
      } while(b <= 20)

      var c = 0

      for (c <- 1 to 10){
      	println(c)
      }

      val abecedary = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

      for (i <- 0 until abecedary.length) {
      	 println(i)
      }

      val list = List(2,3,4,5)

      for (i <- list){
      	println("item list " + list)
      }

      var evenList = for { i <- 0 to 20
        if (i % 2) == 0 
      } yield i 

      for (i <- evenList) 
        println(i)


      for (i <- 0 to 5; j <- 0 to 10){
      	println("i : " + i)
      	println("j : " + j)
      }


	}
}