package day02

object SetDemo {
  def main(args: Array[String]): Unit = {
    //dingyi定义俩个集合
    val list1=List(1,3,5,6,8,9)
    val list2=List(2,4,3,5,8)
    //交集
    val result1=list1.intersect(list2)
    //差集
    val result2=list1.diff(list2)
    //并集
    val result3= list1.union(list2)
    println(result1)
    println(result2)
    println(result3)
  }
}
