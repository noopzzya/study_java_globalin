package com.echoex;

import java.io.*;
import java.net.*;

public class EchoServer {

   public EchoServer() {
      
      try {
         
         // 1. 서버 소켓 생성
         ServerSocket ss = new ServerSocket(5000);
         System.out.println("서버 시작");
         
         Socket s = ss.accept();
         System.out.println("클라이언트와 연결 할 소켓 생성");
         
         // 접속한 클라이언트의 정보를 가져옴
         InetAddress cip = s.getInetAddress();
         String ip = cip.getHostAddress();
         System.out.println("[" +ip+ "]님이 접속 하셨습니다.");
         
         // 소켓으로부터 스트림을 생성(입력, 출력)
         InputStream is = s.getInputStream();
         OutputStream os = s.getOutputStream();
         
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
         
         // 사용자가 전송한 메시지 읽기
         String message = br.readLine();
         System.out.println("메시지:" +message+ "를 입력하였습니다.");
         
         // 사용자에게 메시지를 전송
         bw.write("[" +ip+ "]님 무쟈게 환영합니다. \n");
         bw.flush();      
         
      } catch (IOException ii) {
         ii.printStackTrace();
         System.out.println("해당 port는 누군가에게 사용 중입니다.");
      }
      
   }
   
   public static void main(String[] args) {
      
      new EchoServer();
   }

}