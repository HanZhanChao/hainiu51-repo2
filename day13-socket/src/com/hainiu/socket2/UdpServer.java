package com.hainiu.socket2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author HaiNiu
 * @description  使用UDP协议发送数据
 */
public class UdpServer {

    public static void main(String[] args) throws IOException {
        // 创建接收端Socket
        int port = 10086;
        DatagramSocket socket = new DatagramSocket(port);
        System.out.println("服务器启动，绑定端口号" + port);

        while (true) {
            // 打包接收
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);

            // 接收
            socket.receive(packet); // 阻塞式的
            System.out.println("接收到数据");

            // 解析包裹
            int len = packet.getLength(); // 本次接收到数据的有效长度
            // 字符串
            String str = new String(data, 0, len);
            String ip = packet.getAddress().getHostAddress();

            System.out.println(ip + "说：" + str);
        }

        // 释放资源
//        socket.close();
    }
}
