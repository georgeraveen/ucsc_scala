object salary extends App{
  def tIncome(normalHours:Int,otHours:Int):Int=(normalHours*150)+(otHours*75);

  def tSalary(normalHours:Int,otHours:Int):Double=tIncome(normalHours:Int,otHours:Int)*0.9;

  println(tSalary(40,20));


}
