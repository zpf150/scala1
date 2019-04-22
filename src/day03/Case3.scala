package day03

object Case3 {
  def main(args: Array[String]): Unit = {
    //定义List集合
    val list1=List(2,4,7,10)
    list1 match {
      case 2::Nil => println("只有2")
      case x::y::z::q::Nil =>println(s"${x } ${y} ")
      case 2::4::x::y::Nil => println("匹配成功")
      case _ => println("匹配失败")
    }
  }
}
