package day01

object MethodDemo {
//定义一个方法
  def sum(x:Int,y:Int)={x*y}
  //方法转化为函数
  val fun1=sum _

  def main(args: Array[String]): Unit = {
    //不需要new对象，直接调用
    println(sum(10,20))
  }
}
