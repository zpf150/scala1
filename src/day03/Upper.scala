package day03

class Person2

class Teacher2 extends Person2

class Student2 extends Teacher2


//定义一个上界
class Upper[S <:Teacher2 ] {
def say()={
  println("运行了。。。。。")
    }
}
object Upper{
  def main(args: Array[String]): Unit = {
    //只能传自己本身或者子类
    //本身
    val t1=new Upper[Teacher2]
    t1.say()
    //调用父类，不能用父类
   // val t2=new Upper[Person2]
   // t2.say()
    //调用子类
    val t3=new Upper[Student2]
    t3.say()
  }
}