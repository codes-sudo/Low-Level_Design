package org.example.learning.Tempelate.Example1;

public class OnlineStore extends PhoneOrderTemplate{
    @Override
    void selectProduct() {
        System.out.println("selecting the product in online store");
    }

    @Override
    void makePayment() {
        System.out.println("making the payment in online store");
    }

    @Override
    void deliverProduct() {
        System.out.println("deliver the product at home of the client");
    }

    public void check() {
        System.out.println("checking...");
    }
}
