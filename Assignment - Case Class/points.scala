import scala.math.sqrt
import scala.math.pow
object points extends App {
  case class Point(a:Int,b:Int){
    def x: Int=a
    def y: Int=b

    def +(pt:Point)= Point(this.x+pt.x,this.y+pt.y)
    def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
    def distance(pt:Point)= sqrt(pow(this.x-pt.x,2)+pow(this.y-pt.y,2))
    def invert()=Point(this.y,this.x)
  }

  val p1=Point(1,2)
  val p2=Point(3,4)

  val p3=p1.move(1,2)
  println("Q1")
  println("Point 1 = "+ p1)
  println("Point 2 = "+ p2)
  println("Point 1 + Point 2 = "+ (p1+p2))
  println("Q2")
  println("Move p1 by (1,2)=>p3 : "+(p3))
  println("Q3")
  println("Distance between Point 1 and Point 2 : "+ (p1.distance(p2)))
  println("Q4")
  println("Invert of Point 1 : "+ p1.invert())
}
