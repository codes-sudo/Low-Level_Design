package org.example.learning.Tempelate.Example1;

public class Application {
    public static void main(String[] args) {
        PhoneOrderTemplate offline = new OfflineOrderStore();
        offline.createOrder();

        PhoneOrderTemplate online = new OfflineOrderStore();
        online.createOrder();
    }

}
