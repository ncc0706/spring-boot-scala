package io.arukas.scala

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/22 20:16 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
object BasicFor extends App {

  val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

  for (breed <- dogBreeds) {
    println(breed)
  }

  println("----------------")

}
