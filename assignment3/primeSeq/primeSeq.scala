
object primeSeq extends App{
   def gcd(a:Int,b:Int):Int=b match{
    case 0 => a
    case x if x>a => gcd(x,a)
    case _ => gcd(b,a%b)
  }
//  println(gcd(12,15));
  def prime1(n:Int,i:Int=2):Boolean= i match {
    case x if(x==n) => true
    case x if gcd(n,x)>1 => false
    case x => prime1(n,x+1)
  }
//  println(prime1(21));
  def prime(n:Int,i:Int=2):Boolean= i match {
    case x if(x>(n/2)) => true
    case x if n%x==0 => false
    case x => prime(n,x+1)
  }
//  println(prime(21));

  def primeSeq(n:Int,i:Int=2):Unit= {
    if (n==i){
      return 
    }
    if(prime(i)){
      print(i+",")
    }
    primeSeq(n,i+1)
  }
  primeSeq(10)
}
