package day01

object CloseDemo {
//定义补贴
  val subsidy=2000
  //定义一个方法
  //总工资=工资+年终奖+补贴
  def year(bonus:Double):Double=>Double
 =(wages:Double)=> bonus+wages+ subsidy

  def main(args: Array[String]): Unit = {
    //首先传去工资，得到工资的函数
     val function1 = year(10000)
    //有了工资，接下来就差年终奖了
    val sums = function1(20000)
    println(sums)
  }
}


