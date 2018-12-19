package io.arukas.akka

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/21 20:41 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
object Test01 extends App {


  //  (0 to 10).foreach(i => print(i + " "))
  //  println()
  //  (0 until 10).foreach(i => print(i + " "))
  //  println()

  var i, j = 0
  (0 to 100000).foreach(_ => i += 1)
  (0 to 100000).foreach(_ => j += 1)
  Thread.sleep(1000)
  println(s"${i} ${j}")

}
