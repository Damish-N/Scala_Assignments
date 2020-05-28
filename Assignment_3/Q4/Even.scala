object Even extends App{
	def isEven(number:Int): Boolean = number match {
		case 0 => true
		case _ => isOdd(number-1)  
	}
	
	def isOdd(number:Int):Boolean = !(isEven(number))
	

	println("Enter the number  ")
	var number: Int = scala.io.StdIn.readInt()
	println(number +" It is Even number ?"+ isEven(number))
}