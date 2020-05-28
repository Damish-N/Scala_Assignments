object Add extends App{
	println("Enter the Number you want to addition 1 to n ")
	var number : Int = scala.io.StdIn.readInt()

	def sum(number:Int): Int = {
		number match {
			case 1 => 1
			case _ => number+sum(number-1)  
		}
	}
	println("The sum of Numbers 1 to "+number+" = " + sum(number))
}