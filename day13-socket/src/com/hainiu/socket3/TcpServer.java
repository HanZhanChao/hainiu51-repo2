package com.hainiu.socket3;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author HaiNiu
 * @description 使用TCP协议接收数据
 */
public class TcpServer {

    public static void main(String[] args) throws IOException {

        // 创建接收端Socket
        int port = 12345;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器启动，绑定端口号：" + port);

        // 接收连接
        Socket socket = serverSocket.accept(); // 阻塞式
        System.out.println("建立连接成功");

        // 获取输入流
        InputStream in = socket.getInputStream();

        // 获取发送者信息
        String ip = socket.getInetAddress().getHostAddress();

        // 定义字节数组接收
        byte[] bytes = new byte[1024];
        int len;
        // 读到结束标记才能停止
        while ((len = in.read(bytes)) != -1) { // 阻塞式
            String s = new String(bytes, 0, len);
            System.out.println(ip + "发送：" + s);
        }

        // 释放
        in.close();
        socket.close(); // 结束本次连接
        serverSocket.close(); // 服务器 不关
    }
}
