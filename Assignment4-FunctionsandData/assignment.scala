object assignment extends App {
  class rational(x:Int,y:Int) {
    private def gcd(a:Int, b:Int):Int = {if (b == 0) a else gcd(b, a % b)}
    private val g = gcd(x, y).abs

    def numerator=x/g
    def denominator=y/g
    def neg = new rational(-this.numerator,this.denominator)
    def sub(rat: rational)= new rational(this.numerator*rat.denominator-this.denominator*rat.numerator,this.denominator*rat.denominator)
    def -(rat: rational)= this.sub(rat)
    def out:String = return (this.numerator+"/"+this.denominator)
}
  val x= new rational(3,4)
  val y= new rational(5,8)
  val z= new rational(2,7)
  println("x = "+x.out)
  println("y = "+y.out)
  println("z = "+z.out)
  println("Q1)  -x = "+x.neg.out)
//  println(x.sub(y).out)
//  println(x.-(y).out)
  val result=(x-y-z)
  println("Q2)  x-y-z = "+result.out)

  ////////////////////////////////////////////////////////////////////////////////////////////////////


  class Account(id:String,no: Int, bal: Double) {
    val nic:String=id
    val accountNo: Int = no
    var balance: Double = bal
    override def toString = "["+nic+":"+accountNo +":"+ balance+"]"
    def transfer(account: Account,amount:Double) = {
      this.balance-=amount
      account.balance+=amount
    }
    def withdraw(amount:Double)= this.balance-=amount
    def deposit(amount:Double)= this.balance+=amount

  }
  var bank:List[Account]=List()
  val r = scala.util.Random
  for(x<-0 to 9){
    bank=bank :+ new Account("12345612"+x+"V",x,r.nextInt())
  }
  println("\nAll random accounts [ID, Acc. No., Balance]")
  println(bank)
  bank(1).transfer(bank(2),2.3)
  println("\nQ3)  All accounts after one transfer from account 1 to 2")
  println(bank)
  val overdraft = (accList:List[Account])=> accList.filter(p=> p.balance<0)
  println("\nQ4.1)  List of all negative balance accounts")
  println(overdraft(bank))
  val total = (accList:List[Account])=> accList.reduce((x,y)=> (new Account(x.nic,x.accountNo,x.balance+y.balance)))
  println("\nQ4.2)  Sum of all accounts")
  println(total(bank).balance)
  val interest = (accList: List[Account])=> accList.map(x=> {
    if(x.balance<0)  (new Account(x.nic,x.accountNo,x.balance*1.05)) else (new Account(x.nic,x.accountNo,x.balance*1.1))})
  println("\nQ4.3)  Accounts after interest")
  println(interest(bank))



}





