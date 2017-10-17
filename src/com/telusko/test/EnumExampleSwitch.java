package com.telusko.test;

public class EnumExampleSwitch {
    enum Mobile
    {	APPLE(1000.00), WINDOWS(0.00), SAMSUNG(563.35), HTC(20.00) ;

    double price;
    public double getPrice()
    {
        return price;
    }
    Mobile (double price)
        {
           this.price = price;
        }
    }
    public static void main (String []args)
    {
    Mobile m []= Mobile.values();
    for(Mobile getValues : m)
    {
        System.out.println(getValues);
    }
    }
}
