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
 @Description 客户端给服务端发送消息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String toName;
    private String message;
}
