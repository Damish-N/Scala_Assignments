object Salary extends App {
	def NormalHoursPay(hours:Double):Double=hours*150;

	def OTHoursPay(hours:Double):Double=hours*75;

	def Income(normalhours:Double,othours:Double):Double=NormalHoursPay(normalhours)+OTHoursPay(othours);

	def TaxtoPay(income:Double):Double=income*0.1;

	def TakeHomeSalary(normalhours:Double,othours:Double):Double={

		Income(normalhours,othours)-TaxtoPay(Income(normalhours,othours));

	}
	println("The take homr Salary is Rs:"+" "+TakeHomeSalary(44,20));
}
