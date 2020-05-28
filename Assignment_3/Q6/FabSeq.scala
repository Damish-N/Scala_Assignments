object FabSeq extends App{
	def Fibonacci(number:Int):Int={
		number match {
			case 0 => 0
			case 1 => 1
			case _ => Fibonacci(number-1)+Fibonacci(number-2)
		}
	}
	def FibonacciSeq(number:Int,i:Int=0): Unit ={
		if (i==number){
			print(" "+Fibonacci(i))
			return
		}else{
			print(" "+ Fibonacci(i))
			FibonacciSeq(number,i+1)
		}
	}
	println("Enter the Number")
	var number : Int = scala.io.StdIn.readInt()
	print("The Fibonacci Sequence is the series of numbers 1 to "+number + "= ")
	FibonacciSeq(number)
	print("\n")
}