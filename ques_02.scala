object ques_02 extends App {

      def volume_spehere(radius:Double):Double={
            var volume : Double = (4.0/3.0)*(22.0/7.0)*(radius*radius*radius);
            return volume;
      }

      println("The volume of a sphere with radius  5 =" + volume_spehere(5));
}