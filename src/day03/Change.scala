package day03

object Change {
//定义一个隐士转化的方法
  implicit def anychange(any:Any):Specials={
    //判断是否为Older3类型
    if(any.isInstanceOf[Older3]){
      //如果是，就作为Older3类型，拿到Older3对象
      val older=any.asInstanceOf[Older3]
      new Specials(older.name)
    }else if(any.isInstanceOf[Student3]){
     val student= any.asInstanceOf[Student3]
      new Specials(student.name)
    }else if(any.isInstanceOf[Staff3]){
      val staff= any.asInstanceOf[Staff3]
      new Specials(staff.name)
    }else{
      null
    }
  }
}
