package day03

object Implicit1 {
//定义隐士参数
  implicit val x:Int=100
  //implicit val y:Int=300
  //隐士参数放在最后一位
  def test(x:Int)(implicit y:Int=200)={
    println(x+y)
  }

  def main(args: Array[String]): Unit = {
    //优先级：第一位，自带的参数
    //上下文中的类型，同类型不能超过一个
    //第二位：上下文中定义的参数
    //第三位：隐士参数自带的参数
    test(20)()
    //130  ;  50; 220
  }
}
