package org.example.learning.Adaptar.Example1;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Program Started");
        System.out.println("Program Started");
        AppleCharger appleCharger = new AdapterCharger(new ChargerDK());
        Iphone15 iphone15 = new Iphone15(appleCharger);
        iphone15.chargeIphone();
    }
}
