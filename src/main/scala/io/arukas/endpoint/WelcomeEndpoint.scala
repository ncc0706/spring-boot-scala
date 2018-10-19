package io.arukas.endpoint

import org.springframework.web.bind.annotation.{GetMapping, RestController}

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/11 15:32 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
@RestController
class WelcomeEndpoint {

  @GetMapping(value = Array(""))
  def index() = "scala page."

}
