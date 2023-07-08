package com.hainiu.socket6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author HaiNiu
 * @description 文件上传的服务端  数据从网络中来  数据写到本地
 */
public class FileUploadServer {
    public static void main(String[] args) throws IOException {

        // 启动服务器
        ServerSocket serverSocket = new ServerSocket(33333);

        // 线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                0,
                10,
                30,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
                );

        // 接收到一个请求 就建立一个连接
        while (true) {
            // 接收连接
            Socket socket = serverSocket.accept();
            // 每建立一个连接 就向线程池提交一个任务
            FileUploadTask fileUploadTask = new FileUploadTask(socket);
            pool.submit(fileUploadTask);
        }
//        serverSocket.close(); // 服务器不能关闭
    }
}
