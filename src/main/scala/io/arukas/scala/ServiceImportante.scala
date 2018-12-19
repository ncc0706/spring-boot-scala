package io.arukas.scala

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/22 21:42 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
class ServiceImportante(name: String) {


  def work(i: Int): Int = {

    i + 1
  }

}


object Test extends App {

  val service = new ServiceImportante("dos") with StdoutLogging {

    override def work(i: Int): Int = {
      info(s"Starting work: i = $i")
      val result = super.work(i)
      result
    }

  }

  (1 to 5) foreach (i => println(s"Result: ${service.work(i)}"))


}