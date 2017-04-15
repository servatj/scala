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

      
      for (c <- 1 to 10){
      	println(c)
      }


	}
}