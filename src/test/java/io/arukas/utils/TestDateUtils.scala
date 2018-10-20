package io.arukas.utils

import org.junit.Test

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/20 11:00 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
class TestDateUtils {

  @Test
  def testCurrent() {
    println(DateUtils.currentDate)
    println(DateUtils.currentTime)
    println(DateUtils.fullDate)
  }

}
