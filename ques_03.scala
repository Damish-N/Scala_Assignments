object ques_03 extends App {
      def cost (books:Int):Double = {
        var cover_page_price : Double = (24.95)*(0.6)*books;
        var shipping_cost : Double  = 0.0;
        if(books > 50) {
          shipping_cost= (3.00)+((books-50)*(0.75));
        }else{
          shipping_cost= 3.00;
        }
        var cost_of_books : Double = cover_page_price + shipping_cost ;
        return cost_of_books;
      }
      println ( "The cost of 60 books =  " + cost(60) );
}