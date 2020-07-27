object Negetive extends App {
    class Rational (n:Int,d:Int){
        private def GCD(a:Int,b:Int):Int= { if (b==0 ) a else GCD(b,a%b) }
        def numerater=n/GCD(n,d)
        def denumerater=d/GCD(n,d)

        def negetive= new Rational(-this.numerater,this.denumerater)
        override def toString = numerater + "/" + denumerater
    }
    val a = new Rational(6,8)
    val b = new Rational(3,5)
    val c = new Rational(2,4)
    println(a)
    println(b)
    println(c)
    println( " The negotible value of "+ a + "is " + a.negetive)

}