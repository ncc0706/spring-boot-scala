package io.arukas.scala

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/22 20:11 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
object IF extends App {


  val username: String = "admin"
  val password: String = "admin"


  // if 语句具有返回值.
  val result = if (username == password) {
    "a"
  } else {
    "b"
  }

  println(result)

  // scala 不不支持三元表达式.

}
