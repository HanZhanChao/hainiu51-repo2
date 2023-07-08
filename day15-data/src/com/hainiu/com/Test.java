package com.hainiu.com;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author HaiNiu
 * @description
 */
public class Test {
    public static void main(String[] args) throws UnknownHostException {
        start("localhost",10086,"stopsend","stoppreceive");
    }
    public static void start(String ip,int port,String sendkey,String receivekey) throws UnknownHostException {
        InetAddress iipp=InetAddress.getByName(ip);
        new Thread(new send(iipp, port, sendkey)).start();
        new Thread(new receive(port, receivekey)).start();
    }
}
