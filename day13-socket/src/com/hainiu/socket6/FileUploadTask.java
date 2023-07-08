package com.hainiu.socket6;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

/**
 * @author HaiNiu
 * @description
 */
public class FileUploadTask implements Runnable {

    private Socket socket;

    public FileUploadTask(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        FileOutputStream out = null;
        try {
            InputStream in = socket.getInputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            String name = UUID.randomUUID().toString().replaceAll("-", "");

            // 指向本地文件的输出流
            out = new FileOutputStream("day13-socket\\" + name + ".jpg");

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
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close(); // 开向本地的流 手动关闭
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
