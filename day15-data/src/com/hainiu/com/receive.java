package com.hainiu.com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author HaiNiu
 * @description
 */
public class receive implements Runnable {
    private  int port;
    private  String key;

    public receive(int port, String key) {
        this.port = port;
        this.key = key;
    }

    @Override
    public void run() {
        DatagramSocket socket= null;
        try {
            socket = new DatagramSocket(port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        System.out.println("准备就绪，开始接收");
        while(true){
            try {
                socket.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            String message=new String(packet.getData(),0,packet.getLength());
            if(message.equals(key)){
                System.out.println("关键词正确，停止接收");
                break;
            }
            System.out.println(message);
        }
        socket.close();
    }
}
