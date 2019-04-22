package day03
//不同元素匹配
object Case2 {
  def main(args: Array[String]): Unit = {
    val array1=Array("xiaoli",20,13.5,8L)
    //获取一个元素
    val elems=array1(2)
    //匹配上第一个后，之后不再匹配
    elems match {
      case a:Int => println("Int")
      case b:String => println("String")
      case c:Double => println("Double1")
      case d:Double => println("Double2")
      case e:Long => println("Int")
    }
  }
}
