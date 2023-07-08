package com.hainiu.socket1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author HaiNiu
 * @description
 *
 * // 根据主机名或者IP地址的字符串表示得到IP地址对象
 * public static InetAddress getByName(String host)
 */
public class Demo01_IP {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress ip = InetAddress.getByName("127.0.0.1");
//        InetAddress ip = InetAddress.getByName("192.168.63.189");
//        InetAddress ip = InetAddress.getByName("SuperHan");
        System.out.println(ip);


        String hostName = ip.getHostName();
        System.out.println(hostName);

        String address = ip.getHostAddress();
        System.out.println(address);
    }
}
