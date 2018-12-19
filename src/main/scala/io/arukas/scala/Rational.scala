package io.arukas.scala

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/21 16:15 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
class Rational(n: Int, d: Int) {


  //println(s"created ${n} / ${d}")


  override def toString: String = {
    s"${n} /${d}"
  }

  /**
    * 辅助构造函数
    */
  def this() {
    this(1, 1)
  }

}