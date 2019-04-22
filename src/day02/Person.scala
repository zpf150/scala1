package day02
//val  var 只能主构造器带参数
class Person (val name:String,var age:Int){
//主构造器
  println("主构造器运行了。。。")
  //这里没有提供get  set 方法
  val sex=20
  //辅助构造器
  def this(name:String,age:Int,sex:String){
    this(name,age)
    println("辅助构造器运行了。。。")
  }
}
object preson{
  def main(args: Array[String]): Unit = {
    val peson=new Person("xiaoming",20)
    println("-------------------------")
    new Person("xiaohong",20,"男")
  }
}