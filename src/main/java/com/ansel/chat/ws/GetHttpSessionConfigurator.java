package com.ansel.chat.ws;/**
 * @author Ansel Zhong
 * coding time
 */

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

/**
 @title chat
 @author Ansel Zhong
 @Date 2023/4/9
 @Description
 */
public class GetHttpSessionConfigurator extends ServerEndpointConfig.Configurator {
  @Override
  public void modifyHandshake(ServerEndpointConfig sec, HandshakeRequest request, HandshakeResponse response) {
        HttpSession httpSession =(HttpSession) request.getHttpSession();
        //将httpSession对象存储到配置对象中
        sec.getUserProperties().put(HttpSession.class.getName(),httpSession);
  }
}
