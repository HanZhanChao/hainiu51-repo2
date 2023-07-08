package com.hainiu.charstream;


import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author HaiNiu
 * @description
 */
public class Demo01_Char {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("day10-io\\a.txt");

        int b1 = in.read();
        System.out.println((char) b1);

        int b2 = in.read();
        System.out.println((char) b2);

        int b3 = in.read();
        System.out.println((char) b3);

        int b4 = in.read();
        int b5 = in.read();
        int b6 = in.read();

       String s =  new String(new byte[]{(byte)b4, (byte)b5, (byte)b6});
        System.out.println(s);

        in.close();
    }
}
