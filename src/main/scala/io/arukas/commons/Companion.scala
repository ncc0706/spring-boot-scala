package io.arukas.commons

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/20 11:07 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
class Companion {

  // 不加修饰符默认是public修饰的
  private var username: String = _

  def simplePrint(): Unit = {
    println(s"${Companion.SIGNAL} ${username} ${Companion.SIGNAL}")
  }

}

/**
  * scala中的伴生对象，同一个文件下，与类同名,可以互相访问私有属性及方法.
  */
object Companion {

  // 私有常量属性
  private val SIGNAL = "*"

  def apply(username: String): Companion = {
    val companion = new Companion
    companion.username = username
    companion
  }

}
