package com.ansel.chat.controller;/**
 * @author Ansel Zhong
 * coding time
 */

import com.ansel.chat.entity.Result;
import com.ansel.chat.entity.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;


/**
 @title chat
 @author Ansel Zhong
 @Date 2023/4/3
 @Description
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @RequestMapping ("/login")
  //这里一定要加@RequestBody, 不然无法接收数据
  public Result login(@RequestBody User user, HttpSession session) {
    System.out.println("user"+user);
    Result result = new Result();
    if(user != null && "123".equals(user.getPassword())) {
      result.setFlag(true);
      //将用户名存储到session对象中
      session.setAttribute("user",user.getUsername());
    } else {
      result.setFlag(false);
      result.setMessage("登陆失败");
    }
    return result;
  }

  @RequestMapping("/getUsername")
  public String getUsername(HttpSession session) {
    String username = (String) session.getAttribute("user");
    return username;
  }

}
