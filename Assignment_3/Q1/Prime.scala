
object Prime extends  App {
	def GCD(a:Int,b:Int):Int = {
		b match {
			case x if x==0 => a
			case x if x>a => GCD(x,a)
			case _ =>  GCD(b,a%b)  
		}
	}
	
	// println("Enter Number First Number");
	// var a: Int =scala.io.StdIn.readInt()
	// println("Enter Number Second Number");
	// var b: Int =scala.io.StdIn.readInt()
	// println("The GCD is = " + GCD(a,b))
	def prime(a:Int,b:Int=2): Boolean =b match {
		case x if (x==a) => true
		case x if GCD(a,b)>1 => false
		case x => prime(a,b+1)  
	}
	println("Enter the Number to Find Prime or Not")
	var a: Int =scala.io.StdIn.readInt()
	println("It is a Prime -"+ prime(a))
}