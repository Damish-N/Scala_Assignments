object Substract extends App {
    class Rational (n:Int,d:Int){
        private def GCD(a:Int,b:Int):Int= { if (b==0 ) a else GCD(b,a%b) }
        def numerater=n/GCD(n,d)
        def denumerater=d/GCD(n,d)

        def negetive= new Rational(-this.numerater,this.denumerater)
        override def toString = numerater + "/" + denumerater
        def - (number:Rational)= new Rational(this.numerater*number.denumerater-this.denumerater*number.numerater,this.denumerater*number.denumerater)
    }
    val a = new Rational(3,4)
    val b = new Rational(5,8)
    val c = new Rational(2,7)
    println("Rational x is " +a )
    println("Rational y is " +b)
    println("Rational z is " +c)
    // println( " The negotible value of "+ a + "is " + a.negetive)
    val result= a-b-c
    println("The Answer is X - Y - Z = "+ result)
}