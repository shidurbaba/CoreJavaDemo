package com.telusko.test;

public class EnumExample {

    enum Mobile {	APPLE, WINDOWS, SAMSUNG, HTC ;}
    public static void main (String []args){
        System.out.println(Mobile.APPLE);
        System.out.println(Mobile.WINDOWS);
        System.out.println(Mobile.SAMSUNG);
        System.out.println(Mobile.HTC);
    }
}
