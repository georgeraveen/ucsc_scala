object book extends App{
  def shipping(x:Double)=if (x>50) 3*50+(x-50)*0.75 else 3*x;
  
  def discount(y:Double):Double=y*0.4;

  def price(z:Int):Double=z*24.95;

  def wholePrice(t:Double)=price(60)-discount(60)+shipping(60);
  println(wholePrice(60));
  

}

