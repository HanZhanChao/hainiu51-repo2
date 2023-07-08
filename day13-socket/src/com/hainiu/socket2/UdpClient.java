package com.hainiu.socket2;

import java.io.IOException;
import java.net.*;

/**
 * @author HaiNiu
 * @description 使用UDP协议发送数据
 */
public class UdpClient {
    public static void main(String[] args) throws Exception {

        // 1、创建发送端Socket对象   客户端随机绑定一个端口号启动
        DatagramSocket socket = new DatagramSocket();

        /*
        public DatagramPacket(byte buf[], int length, InetAddress address, int port)
         */
        // 数据转换为字节数组
        byte[] data = "hello UPD 你好~".getBytes();
        // 发送目的地
        InetAddress ip = InetAddress.getByName("127.0.0.1"); // 192.168.63.189
        // 发送目的地的端口号
        int port = 10086;

        // 数据打包
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);

        // 发送
        socket.send(packet);

        // 释放资源
        socket.close();
    }
}
