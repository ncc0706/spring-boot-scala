package io.arukas.scala

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/22 20:25 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
object GuardFor extends App {


  val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Scottish Terrier", "Great Dane", "Portuguese Water Dog")

  for (bree <- dogBreeds if bree.contains("Terrier")) println(bree)

}
