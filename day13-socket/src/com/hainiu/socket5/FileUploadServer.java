package com.hainiu.socket5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * @author HaiNiu
 * @description 文件上传的服务端  数据从网络中来  数据写到本地
 */
public class FileUploadServer {
    public static void main(String[] args) throws IOException {

        // 启动服务器
        ServerSocket serverSocket = new ServerSocket(33333);

        // 接收连接
        Socket socket = serverSocket.accept();

        InputStream in = socket.getInputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String name = UUID.randomUUID().toString().replaceAll("-", "");

        // 指向本地文件的输出流
        FileOutputStream out = new FileOutputStream("day13-socket\\" + name + ".jpg");

        // 读
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }

        // 给出反馈
        writer.write("文件上传成功");
        writer.newLine();
        writer.flush();

        out.close(); // 开向本地的流 手动关闭
        socket.close();
        serverSocket.close();
    }
}
