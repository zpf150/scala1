package day03
//教授
class  Master
//专家
class  Perfessor extends Master
//教师
class Teacher extends  Perfessor
//定义下界
class Lower[T >:Perfessor ] {
def say()={
  println("下界运行了。。。。")
}
}
object  Lower{
  def main(args: Array[String]): Unit = {
    //父类是可以运行的
   val t1= new  Lower[Master]
    t1.say()
    //自己本身也可以运行
    val t2= new  Lower[Perfessor]
    t2.say()
    //子类不可以运行的
   //val t3= new  Lower[Teacher]
  // t3.say()
  }
}