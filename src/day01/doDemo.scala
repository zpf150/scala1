package day01

object doDemo {
  def main(args: Array[String]): Unit = {
    var num = 0
    do {
      //至少执行一次
      println(num)
      num = num+1
    } while (num <= 5)
  }
}