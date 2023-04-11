package com.ansel.chat.config;/**
 * @author Ansel Zhong
 * coding time
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 @title chat
 @author Ansel Zhong
 @Date 2023/4/9
 @Description
 */
@Configuration
public class WebSocketConfig {

  @Bean
  // 注入ServerEndpointExporter的 bean对象 自动注册来扫描@ServerEndPoint注解的bean
  ServerEndpointExporter serverEndpointExporter(){
    return new ServerEndpointExporter();
  }
}
