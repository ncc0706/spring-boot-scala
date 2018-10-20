package io.arukas.utils

import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/20 10:35 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
object DateUtils {

  /**
    * 获取当前日期
    *
    * @return
    */
  def currentDate = converter("yyyy-MM-dd")

  /**
    * 获取当前时间
    *
    * @return
    */
  def currentTime = converter("HH:mm:ss")

  /**
    * 获取当前日期时间
    *
    * @return
    */
  def fullDate = converter("yyyy-MM-dd HH:mm:ss")

  /**
    * 根据传入的格式转换当前时间
    *
    * @param format
    * @return
    */
  private[this] def converter(format: String): String = {
    val date = new Date
    val sdf = new SimpleDateFormat(format)
    sdf.format(date)
  }
}
