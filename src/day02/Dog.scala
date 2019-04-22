package day02

class Dog {
//定义变量
  private  val name="二哈"
  private var age=2
  //顶一个方法
  private def say()={
    println(name+Dog.speak)
  }
}

object Dog{
  private val speak="汪汪汪"
  def main(args: Array[String]): Unit = {
   //new对象
    val dog=new Dog
    dog.age=3
    dog.say()
  }

}