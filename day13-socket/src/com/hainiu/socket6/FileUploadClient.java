package com.hainiu.socket6;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author HaiNiu
 * @description 文件上传的客户端  数据从文件中来  数据写到网络中
 */
public class FileUploadClient {
    public static void main(String[] args) throws IOException {

        // C:\Users\D\Pictures\Camera Roll\bb.jpg

        // 创建输入流读取文件
        FileInputStream in = new FileInputStream("C:\\Users\\D\\Pictures\\Camera Roll\\bb.jpg");

        // 创建发送端Socket对象
        Socket socket = new Socket(InetAddress.getByName("localhost"), 33333);

        // 获取输出流
        OutputStream out = socket.getOutputStream();

        // 获取输入流 包装成字符流
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // 读写操作
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
        // 告知服务端 数据写完了， 但是不能关流
        socket.shutdownOutput(); // 写出一个结束标记  使得服务端的读能够停止

        // 读反馈
        String result = reader.readLine(); // 换行符
        System.out.println(result);

        // 客户端关闭
        in.close();  // 开向本地的流 手动关闭
        socket.close();
    }
}
