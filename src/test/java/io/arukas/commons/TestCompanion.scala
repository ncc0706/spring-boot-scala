package io.arukas.commons

import org.junit.Test

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/20 11:18 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
class TestCompanion {

  /**
    * 伴生对象测试
    */
  @Test
  def test01(): Unit = {
    // 通过伴生对象创建对象并调用方法
    val companion = Companion("hello")
    companion.simplePrint()

    // 通过new的方式
    new Companion().simplePrint();

  }

}
