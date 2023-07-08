package com.hainiu.socket4;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description 客户端发送请求给服务端 并 接收反馈
 */
public class TcpClient {

    public static void main(String[] args) throws Exception {

        // 创建Socket对象
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        int port = 22222;
        Socket socket = new Socket(ip, port);

        // 对于客户端，数据来源：键盘录入
        Scanner sc = new Scanner(System.in);
        // 获取输出流 -- 把录入的数据写给服务器
        // 将数据按行发送
        // 将字节流包装成字符流
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // 发送多次数据
        while (true) {
            // 自定义结束规则
            System.out.println("请输入字符串，服务器会反转：");
            String s = sc.nextLine();
            if ("over".equals(s)) {
                break;
            }
            // 发
            writer.write(s);
            writer.newLine(); // 为了让服务器接收一行  标记
            writer.flush(); // 刷新缓冲区 保证数据能够按照行刷新到目的地

            // 读取反馈
            String revS = reader.readLine();
            System.out.println("服务器返回的数据是：");
            System.out.println(revS);
        }
        // 断开连接
        socket.close();
    }
}
