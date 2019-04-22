package day01

object MethodandFun {
  //第一种方式
  val fun1=(x:Int,y:Int)=>{x*y}
  //第二种写法
  val fun2:(Int,Int)=> Int=(x,y)=>{x+y}
  //第一种定义方法
  def method1(a:Int,b:Int) ={
    fun1(a,b)
  }

  //第二种定义方法
  def method2(fun2:(Int,Int)=>Int) ={
  fun2(20,30)
  }

  def main(args: Array[String]): Unit = {
    println(method1(20,30))==600
    println(method2(fun2))==50
  }
}
