package day01
import scala.collection.immutable

object ForDemo {
  def main(args: Array[String]): Unit = {
    //来个数字生成器  to   until
    //to 前后都包括
    //until  只包括前，不包括后
    //特殊符号  <-
    for (num <- 1 until 5) {
      println(num)
    }
    //遍历字符串
    for (str <- "asdfgh") print(str + " ")
    //九九乘法表
    for (i <- 1 to 9;j <- 1 to i){
      if(i == j){
        println(i+"*"+j+"="+i*j)
      }else{
        print(j+"*"+i+"="+j*i+"\t")
      }

    }
    //守卫模式
    for (i <- 1 to 10  if(i%2==0)){
      println(i)
    }
    //for推导模式  yield
   val result2: immutable.Seq[Int] = for (i <- 1 to 10) yield i*2
    println(result2)
  }
}
