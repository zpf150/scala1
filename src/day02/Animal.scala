package day02
abstract class Animal {
//先定义抽象字段，必须重写
  val age:Int
  //非抽象字段,可以选择被重写,不能带override
  var name: String = "猴子"
  //定义抽象方法
  def sleep()
  //定义非抽象方法
  def eat()={
    println("吃红烧肉")
  }
  //使用final修饰的方法,不能被重写
  final  def action()={
  println("爱爬树")
  }
}
class mokey extends Animal{
  //抽象字段必须重写
  override val age: Int = 20
//抽象方法，重写的睡觉方法
  override def sleep(): Unit = {
    println("睡了十个小时")
  }
}

object mokeys{
  def main(args: Array[String]): Unit = {
   val mo =new mokey
    mo.action()
    mo.name="猪"
    mo.sleep()
  }
}