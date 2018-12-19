package io.arukas.scala

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/22 21:38 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
trait Logging {

  def info(message: String): Unit

  def waring(message: String): Unit

  def error(message: String): Unit

  def debug(message: String): Unit

}

trait StdoutLogging extends Logging {

  def info(message: String): Unit = println(s"info: $message")

  def waring(message: String): Unit = println(s"info: $message")

  def error(message: String): Unit = println(s"info: $message")

  def debug(message: String): Unit = println(s"info: $message")
}