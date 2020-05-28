object EvenAdd extends App{
	def isEven(number:Int): Boolean = number match {
		case 0 => true
		case _ => isOdd(number-1)  
	}
	
	def isOdd(number:Int):Boolean = !(isEven(number))
	
	def EvenAddition(number:Int,n:Int=0):Int={
		if(number==2){
				n+2
		}else{
			if(isEven(number)){
				// println("Value "+n)
				EvenAddition(number-2,n+number);
			}else{
				EvenAddition(number-1,n)
			}
			
		}
	}

	println("Enter the number  ")
	var number: Int = scala.io.StdIn.readInt()
	println("addition of all even numbers less than given "+ number+ " = "+EvenAddition(number))
}