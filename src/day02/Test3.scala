package day02
trait Test3 {
println("1:Test3的方法执行了")
}
trait Test3_01 extends Test3{
  println("2:Test3_01的方法执行了")
}
trait Test3_02 extends Test3{
  println("3:Test3_02的方法执行了")
}
class Person2{
  println("4:Person2的方法执行了")
}
class  Students extends Person2 with Test3_01 with Test3_02{
  println("5:Students的方法执行了") //new Students
}
//4,1,2,3,5
object test4{
  def main(args: Array[String]): Unit = {
    new Students
  }
}
//4,1,2,3,5
//4,5,1,2,3
//