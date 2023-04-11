//package com.ansel.chat.ws;/**
// * @author Ansel Zhong
// * coding time
// */
//
//import com.ansel.chat.entity.Message;
//import com.ansel.chat.utils.MessageUtils;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.http.HttpSession;
//import javax.websocket.*;
//import javax.websocket.server.ServerEndpoint;
//import java.util.Map;
//import java.util.Set;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.concurrent.CopyOnWriteArraySet;
//
///**
// @title chat
// @author Ansel Zhong
// @Date 2023/4/9
// @Description
// */
//@ServerEndpoint(value = "/chat",configurator = GetHttpSessionConfigurator.class)
//@Component
////每一个客户端都有与之相对应的对象
//public class ChatEndPoint2 {
//
//  // 用来存储每一个客户端对象对应的chatendpoint对象
//  private static CopyOnWriteArraySet<ChatEndPoint2> onlineUsers = new CopyOnWriteArraySet<>();
//  private static CopyOnWriteArraySet<String> onlineUsername = new CopyOnWriteArraySet<>();
//
//  //声明session对象，通过该对象可以发送消息给指定的用户
//  private Session session;
//
//  //声明一个HttpSession对象，我们之前在HttpSession对象中存储了用户名
//  private HttpSession httpSession;
//
//  // 连接建立时被调用执行
//  @OnOpen
//  public void onOpen(Session session, EndpointConfig config){
//    //将局部的session对象赋值给成员session
//    this.session = session;
//    //获取httpSession对象
//    HttpSession httpSession1 =(HttpSession) config.getUserProperties().get(HttpSession.class.getName());
//    this.httpSession = httpSession1;
//    //从httpSession对象中获取用户名
//    String username = (String) httpSession.getAttribute("user");
//    System.out.println("ChatEndPoint:onOpen:httpSession1"+username);
//    //将当前对象存储到容器中
//    onlineUsers.add(this);
//    onlineUsername.add(username);
//
//    //将当前在线的用户名推送给所有客户端
//    //1. 获取消息
//    String message = MessageUtils.getMessage(true, null, onlineUsername);
//    System.out.println("ChatEndPoint:onOpen:httpSession1"+onlineUsername);
//    //2. 调用方法进行系统消息的推送
//    broadcastAllUsers(message);
//  }
//
//  private void broadcastAllUsers(String message){
//    try{
//      // 将该消息推送给所有的客户端
//      for (ChatEndPoint2 onlineUser : onlineUsers) {
//         onlineUser.session
//                 .getBasicRemote()
//                 .sendText(message);
//      }
////      for (String name : names) {
////        ChatEndPoint2 chatEndPoint = onlineUsername.get(name);
////        chatEndPoint.session
////                .getBasicRemote()
////                .sendText(message);
////      }
//    }catch (Exception e){
//      e.printStackTrace();
//    }
//
//  }
//
//
//
//  // 接收到客户端发送的数据被调用
//  @OnMessage
//  public void onMessage(String message, Session session){
//     //将message转换成message对象
//     ObjectMapper mapper = new ObjectMapper();
//    try {
//      Message mes = mapper.readValue(message, Message.class);
//      String toName = mes.getToName();
//      //获取消息数据
//      String data = mes.getMessage();
//      //获取当前登录的用户
//      String username
//              = (String)httpSession.getAttribute("user");
//      //获取推送给指定用户的消息格式的数据
//      String resultMes = MessageUtils.getMessage(false, username,data);
//      //发送数据
//
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//  }
//
//  @OnClose
//  public void onClose(Session session){
//
//  }
//}
