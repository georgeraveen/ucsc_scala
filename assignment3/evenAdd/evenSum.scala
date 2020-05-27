
object evenSum extends App{
  def isEven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !(isEven(n))
//  print(isEven(11))

  def evenSum(n:Int,t:Int=0):Unit={

    if(n== -1) println(t)

    else{
      if(isEven(n)) evenSum(n-1,t+n)
      else evenSum(n-1,t)
    }
  }
  evenSum(10)
}
