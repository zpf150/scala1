package day03

object CurrayDemo {
//定义一个普通方法
  def add1(x:Int,y:Int)={
    x*y
  }
  //定义克里化方法
  def add2(x:Int)(y:Int)={
    x+y
  }

  def main(args: Array[String]): Unit = {
    //println(add1(20,30))
    //println(add2(20)(30))
    //第二种写法
    val result=add2(20) _
   val sum= result(30)
    println(sum)
  }
}
