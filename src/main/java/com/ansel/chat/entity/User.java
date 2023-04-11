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
 @Date 2023/4/9
 @Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String password;
}
