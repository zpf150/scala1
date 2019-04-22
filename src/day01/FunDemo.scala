package day01

object FunDemo {
//第一种方式
  val fun1=(x:Int,y:Int)=>{if(x>y) x else y}
  //第二种写法
  val fun2:(Int,Int)=> Int=(x,y)=>{if(x>y) x else y}

  def main(args: Array[String]): Unit = {
   println(fun1(20,30))
    println(fun2(20,30))
  }
}
