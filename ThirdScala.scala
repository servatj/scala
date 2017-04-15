object ThirdScala {
	def main (args: Array[String]){
      def getSum(num1 : Int = 0, num2: Int = 0) : Int = {
      	return num1 + num2
      }

      println(getSum(1,2))
      println(getSum(1))
	
	  def getSumArray(args : Int*) : Int = {
        var sum : Int = 0
        for(num <- args){
        	sum += num 
        }
        sum
	  }

      println(getSumArray(1,3,4,5,5))


      def factorial(num : BigInt) : BigInt = {
      	if(num <= 1){
          1 
      	}else{
      	   num * factorial(num - 1)
      	}
      }

      println(factorial(5))

	}
}