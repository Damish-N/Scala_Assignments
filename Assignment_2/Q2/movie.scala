object movie extends App{

	def Attendents(Ticket_price:Int): Int ={
		 var NoOfAttendents  = 120 + (15-Ticket_price)/5*20
		return NoOfAttendents;
	}
	def IncomeFrom(Ticket_price:Int): Int ={
		var income  = Attendents(Ticket_price)*Ticket_price
		return income;
	}
	def CostFrom(Ticket_price:Int):Int = {
		var cost = Attendents(Ticket_price)*3 + 500
		return cost;
	}
	def Netprofit(Ticket_price:Int): Int ={
		var profit = IncomeFrom(Ticket_price)-CostFrom(Ticket_price)
		return profit;
	}
	 // print(Netprofit(5), Netprofit(10), Netprofit(15), Netprofit(20));
	// print(Netprofit(25), Netprofit(30),Netprofit(35), Netprofit(40));
	
	def max_profitx_finder() :Int={
		var Ticket_price : Int =45;
		//Ticket_price began 45 becuase of when ticket was rs 45 there are 0 Attendents;
		// Then run it with end of the ticket price -> 0 there cannot be minus values;
		var pp: Int =0;
		var max_profit: Int =0;
		var max_ticket: Int =0 ;

	while(Ticket_price >= 0 ){
		// print("The Ticket_price : " + Ticket_price + "The gain profit :" + Netprofit(Ticket_price)+" \n");
		if(Netprofit(Ticket_price)>=max_profit){
			max_ticket=Ticket_price;
			max_profit=Netprofit(Ticket_price);
			// print("sdsddd"+Ticket_price);
			}
			Ticket_price=Ticket_price-5;
			// print(max_profit);
		}
		print("\n \t The maximum profit gain :"+ max_profit + "\n");
		print("\n \t The maximum profit gain's Ticket_price :"+ max_ticket + "\n \n");


		return(max_profit);
	}
	max_profitx_finder();
}