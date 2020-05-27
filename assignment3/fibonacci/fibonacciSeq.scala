
object fibonacciSeq extends App{
    def fibonacciSequence(n:Int,i:Int=0,j:Int=0,k:Int=1): Unit= {
    if(i==n) return
    if(i==0) {
      print("0,1,")

    }
    print(j+k+",")
    fibonacciSequence(n,i+1,k,j+k)
  }
//  fibonacciSequence(10)
  ////////////////
  def fibonacci(n:Int):Int= n match{
    case 0 => 0
    case x if x==1 => 1
    case _ => fibonacci(n-1)+fibonacci(n-2)
  }
  def fibonacciSeq(n:Int):Unit= {
    if (n > 0) fibonacciSeq(n-1)
    println(fibonacci(n))
  }
  fibonacciSeq(15)

}
