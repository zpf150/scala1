package day03
//老人
class Older3(var name:String)
//学生
class Student3(var name:String)
//员工
class Staff3(var name:String)
//特殊人群
class Specials(var name:String)

object Implicut2 {
  //特殊人群
  def spcial(p:Specials)={
    if(p == null){
      println("您是特殊人群")
    }else{
      println("您是正常人群，请排队")
    }
  }
  def main(args: Array[String]): Unit = {
    val older=new Older3("老明")
    val student=new Student3("小花同学")
    val staff=new Staff3("员工")
    //固定写法
    import Change._
    spcial(older)
  }
}
