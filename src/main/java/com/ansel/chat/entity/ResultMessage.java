package com.ansel.chat.entity;/**
 * @author Ansel Zhong
 * coding time
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 @title chat
 @author Ansel Zhong
 @Date 2023/4/3
 @Description 服务端给客户端发送的消息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultMessage {
  private boolean isSystem;
  private String fromName;
  private Object message;
  private boolean isOnline;
}
