package io.arukas.scala

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/22 20:47 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
object ScopedOptionFor extends App {

  val dogBreeds = List(Some("Doberman"), None, Some("Yorkshire Terrier"),
    Some("Dachshund"), None, Some("Scottish Terrier"),
    None, Some("Great Dane"), Some("Portuguese Water Dog"))

  println("first pass:")

  for {
    breedOption <- dogBreeds
    breed <- breedOption
    upcasedBreed = breed.toUpperCase
  } println(upcasedBreed)

  println("second pass:")
  for {
    Some(breed) <- dogBreeds
    upcasedBreed = breed.toUpperCase()
  } println(upcasedBreed)

  // Scala 的 for 推导式并不提供 break 和 continue 功能
}
