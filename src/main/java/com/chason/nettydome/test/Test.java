package com.chason.nettydome.test;

/**
 * Created by chason on 2018/4/24.14:57
 */
public class Test {
    public static void main(String[] args) {
        Byte a = (byte) 53;
        System.out.println(a & 0x0f);
        System.out.println(a >> 4 & 0x0f);
    }
}
