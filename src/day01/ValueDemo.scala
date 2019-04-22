package day01

object ValueDemo {
//定义一个钱数
  var money=100
  //定义一个买东西的方法
  def buy()={
    money=money-5
  }
  //定义一个查看钱数的方法
  def see():Int={
    buy()
    money
  }
  //定义一个value方法,传值（具体的值）调用
  //这里的参数是int类型
  def byValue(x:Int)={
    for(i <- 1 to 5){
      println("钱数："+x+"元")
    }
  }
  //定义一个方法，传名(函数)调用
  //我的参数是一个函数
  def byName(x: =>Int)={
    for(i <- 1 to 5){
      println("钱数："+x+"元")
    }
  }

  def main(args: Array[String]): Unit = {
    println("-------传值调用--------")
    byValue(see())
    println("-------传名调用--------")
    byName(see())
  }
}
