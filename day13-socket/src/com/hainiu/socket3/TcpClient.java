package com.hainiu.socket3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author HaiNiu
 * @description 使用TCP协议发送数据
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {

        // 创建发送端Socket对象 -- 要连接的主机ip和端口号

        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 12345;
        Socket socket = new Socket(ip, port);

        // 获取输出流对象
        OutputStream out = socket.getOutputStream();

        // 写出数据
        out.write("hello TCP 你好~".getBytes());

        /*while (true) {

        }*/

        // 释放资源
        out.close(); // 输出流的关闭方法 会给服务端一个结束标记
        socket.close();
    }
}
