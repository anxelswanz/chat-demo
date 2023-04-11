package com.ansel.chat.entity;/**
 * @author Ansel Zhong
 * coding time
 */

/**
 @title chat
 @author Ansel Zhong
 @Date 2023/4/3
 @Description
 */
/**
 * @version v1.0
 * @ClassName: Result
 * @Description: 用于登陆响应回给浏览器的数据
 * @Author: 黑马程序员
 */
public class Result {
  private boolean flag;
  private String message;

  public boolean isFlag() {
    return flag;
  }

  public void setFlag(boolean flag) {
    this.flag = flag;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

