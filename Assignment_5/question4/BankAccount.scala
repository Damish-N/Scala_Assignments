import scala.collection.immutable._  
import scala.math.BigDecimal
object BankAccount extends   App {
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
    var BankAccounts  : List[Account] = List(new Account("972702366V",1154,820456.68),new Account("912121266V",8654,145456.48),new Account("912121266V",168654,125456.48),
   new Account("200121556V",325202,1255.68),new Account("556541366V",19558,1122456.68),new Account("556541366V",15558,11456.45))
    // BankAccount(): + ;new Account("972702366V",100154,12456.68)
    // BankAccounts: + ;new Account("986541366V",119558,2456.68)
    // BankAccounts: + ;new Account("912121266V",168654,12545456.48)
    // BankAccounts: + ;new Account("200121556V",325202,1255.68)
    
    //println(BankAccounts[1])
    println("\n")
    println("The Bank Deatails Before the Transfer\n")
    for ( element <- BankAccounts){
        println(element)
    }
    println("\n")
    println("The Bank Deatails After the Transfer\n")
    BankAccounts(0).transfer(BankAccounts(1),145520.80)
    BankAccounts(2).transfer(BankAccounts(3),253565.40)
    BankAccounts(5).transfer(BankAccounts(4),15920.46)

     for ( element <- BankAccounts){
        println(element)
    }
    // println("\n")
    // println("The Negetive balance Accounts")
    
    val overdraft = (accountlist:List[Account])=>accountlist.filter(x=>x.balance < 0)
    println("\n")
    println("The Negetive balance Accounts\n")
    for ( element <- overdraft(BankAccounts)){
        println(element)
    }
    val balance =(accountlist:List[Account])=>accountlist.reduce((x,y)=>new Account(x.nic,x.acc_number,x.balance+y.balance))
     // println("The Total balances of Accounts\n")
      println("Total Amount of the accounts Rs:" + balance(BankAccounts).balance + "\n")

    val interst = (accountlist:List[Account])=>accountlist.map(x=>{if(x.balance>0) new Account(x.nic,x.acc_number,x.balance*1.05) else (new Account(x.nic,x.acc_number,x.balance*1.10))})
    for ( element <- interst(BankAccounts)){
        println(element)
    }
}
