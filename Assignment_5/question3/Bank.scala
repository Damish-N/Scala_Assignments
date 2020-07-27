import scala.collection.immutable._  
import scala.math.BigDecimal
object Bank extends App {
    class Account (id:String,n:Int,b:Double){
        val nic : String = id
        val acc_number: Int = n
        var balance : Double = b

        override def toString = nic+ " : " + acc_number + " : Rs " + BigDecimal(balance).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

        
        def transfer (acc : Account, transferAmount:Double){
            this.balance=this.balance-transferAmount
            acc.balance=acc.balance+transferAmount;
        }
    }
    // made a list to put some bank details
    var BankAccounts  : List[Account] = List(new Account("972702366V",1154,12456.68),new Account("912121266V",8654,145456.48),new Account("912121266V",168654,125456.48),
   new Account("200121556V",325202,1255.68) )
    // BankAccount(): + ;new Account("972702366V",100154,12456.68)
    // BankAccounts: + ;new Account("986541366V",119558,2456.68)
    // BankAccounts: + ;new Account("912121266V",168654,12545456.48)
    // BankAccounts: + ;new Account("200121556V",325202,1255.68)
    
    //println(BankAccounts[1])
    println("The Bank Deatails Before the Transfer")
    for ( element <- BankAccounts){
        println(element)
    }
    println("The Bank Deatails After the Transfer")
    BankAccounts(0).transfer(BankAccounts(1),100000.20)
    BankAccounts(2).transfer(BankAccounts(3),25000.40)
     for ( element <- BankAccounts){
        println(element)
    }

}
