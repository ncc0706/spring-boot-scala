package io.arukas.endpoint

import io.arukas.service.UserService
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestMapping, RestController}

/**
  * Created by IntelliJ IDEA. <br/>
  *
  * @Auther: 牛玉贤 <br/>
  * @Date: 2018/10/10 13:21 <br/>
  * @Email: ncc0706@gmail.com <br/>
  */
@RestController
@RequestMapping(value = Array("users"))
class UserEndpoint(userService: UserService) {


  @GetMapping(value = Array("", "/"))
  def users(): String = {
    userService.demo()
    "users"
  }

  @PostMapping(value = Array("add"))
  def addUser(username: String): String = {
    println(username)

    "ok"
  }

}
