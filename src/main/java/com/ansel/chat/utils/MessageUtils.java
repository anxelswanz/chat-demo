package com.ansel.chat.utils;/**
 * @author Ansel Zhong
 * coding time
 */

/**
 @title chat
 @author Ansel Zhong
 @Date 2023/4/3
 @Description
 */

import com.ansel.chat.entity.ResultMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @version v1.0
 * @ClassName: MessageUtils
 * @Description: 用来封装消息的工具类
 * @Author: 黑马程序员
 */
public class MessageUtils {

  public static String getMessage(boolean isSystemMessage, String fromName, Object message) {
    try {
      ResultMessage result = new ResultMessage();
      result.setSystem(isSystemMessage);
      result.setMessage(message);
      if(fromName != null) {
        result.setFromName(fromName);
      }
      ObjectMapper mapper = new ObjectMapper();

      return mapper.writeValueAsString(result);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return null;
  }
}
