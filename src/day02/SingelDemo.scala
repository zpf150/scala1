package day02

object SingelDemo {
  var age=20
def say(name:String)={
  println("我的名字叫"+name)
}
}
object  test{
  def main(args: Array[String]): Unit = {
    SingelDemo.say("小明")
    SingelDemo.age=30
  }
}