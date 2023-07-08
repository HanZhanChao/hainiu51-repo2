package com.hainiu.socket4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author HaiNiu
 * @description
 */
public class TcpServer {

    public static void main(String[] args) throws IOException {

        // 启动服务器
        ServerSocket serverSocket = new ServerSocket(22222);

        // 接收连接
        Socket socket = serverSocket.accept();

        // 接收数据  发数据
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line;
        while ((line = reader.readLine()) != null) {
            // 反转后写回
            String revLine = new StringBuilder(line).reverse().toString();

            writer.write(revLine);
            writer.newLine();
            writer.flush();
        }

        socket.close();
        serverSocket.close();
    }
}
