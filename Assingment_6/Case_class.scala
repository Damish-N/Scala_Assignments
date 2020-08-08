import scala.math.sqrt
object case_class extends App{
    val p1= Point(8,10);
    val p2= Point(3,4);
    // val p4= p2.distance(p1)
    // val p5=p3.invert()
    println("Q1.")
    println("The value of Point 1 :"+ p1)
    println("The value of Point 2 :"+ p2)
    println("point 1 + point 2 :"+ (p1+p2))
    println("Q2.")
    val p3= p2.move(4,6)
    println("Move the point 2 by (4,6) :" + p3)
    println("Q3.")
    println("Distance of point 1 and  point 2 :"+  p2.distance(p1))
    // println(p4)
    println("Q4.")
    println("Invert the values of Point 1 :"+ p1.invert())
    // println(p5)
}

case class Point(a:Int,b:Int){
    def x : Int= a;
    def y : Int= b;

    def +(p:Point)=Point(this.x+p.x,this.y+p.y);
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy);
    def distance(p:Point)=sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y))
    def invert()=Point(this.y,this.x)
}