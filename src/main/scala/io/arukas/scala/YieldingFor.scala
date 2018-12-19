package io.arukas.scala

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/22 20:35 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
object YieldingFor extends App {

  val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
    "Scottish Terrier", "Great Dane", "Portuguese Water Dog")


  // yield 关键字能在for表达式中生成新的集合.
  // 当 for 推导式仅包含单一表达式时使用原括号
  val filteredBreeds = for {breed <- dogBreeds if breed.contains("Terrier") && !breed.startsWith("Yorkshire")} yield breed

  println(filteredBreeds)

}
