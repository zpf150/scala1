package day03

import scala.util.Random

object Case1 {
  //匹配字符窜
  def main(args: Array[String]): Unit = {
      //定义一个字符串数组
    val stu=Array("xiaoming","xiaohong","xiaozhao")
    //定义一个随机数
    val num=Random.nextInt(stu.length)
    val name=stu(num)
    //匹配
    name match {
      case "xiaoming" => println("小明")
      case "xiaohong" => println("小红")
      case _  => println("不知道")
    }
  }
}
