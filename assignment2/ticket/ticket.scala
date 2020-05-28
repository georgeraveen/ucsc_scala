
object ticket extends App{
  def attende(price:Int):Int=120+(15-price)/5*20;
  
  def revenue(price:Int):Int = attende(price)* price;

  def cost(price:Int):Int=500+attende(price);

  def profit(price:Int):Int = revenue(price)- cost(price);

  def best(){
    var x=5;
    var a=profit(x);
    while(a<profit(x+5)){
      a=profit(x+5);
      x=x+5;
    }
    println("best price is ",a);
    println("best ticket price is ",x);

  }
  best();

}
