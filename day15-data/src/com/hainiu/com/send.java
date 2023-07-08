package com.hainiu.com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

/**
 * @author HaiNiu
 * @description
 */
public class send implements Runnable{
    private InetAddress ip;
    private int port;
    private String key;

    public send(InetAddress ip, int port, String key) {
        this.ip = ip;
        this.port = port;
        this.key = key;
    }

    @Override
    public void run() {
        DatagramSocket socket= null;
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            e.printStackTrace();
        }
        Scanner sc =new Scanner(System.in);
        System.out.println("准备就绪，开始发送");
        while(sc.hasNext()) {
            String message=sc.nextLine();
            if(message.equals(key)){
                System.out.println("检测到关键字，停止发送");
                break;
            }
            DatagramPacket packet=new DatagramPacket(message.getBytes(),message.getBytes().length,ip,port);
            try {
                socket.send(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();

    }
}
