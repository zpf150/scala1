package day01

object IfDemo {
  def main(args: Array[String]): Unit = {
    //定义第一个变量.末尾不需要分号
    val age=18
    if(age>18){
      println("我成年了。。。")
    }else{
      println("我不能谈恋爱。。。。")
    }
    //if有返回值的,返回值由最后一行决定，不要要return
    val result: Any =if(age<20) {
      println("不能去网吧")
      123
      "xiaomin"
    }else{
      40
    }
  }
}
