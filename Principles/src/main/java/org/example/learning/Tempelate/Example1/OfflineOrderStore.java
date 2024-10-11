package org.example.learning.Tempelate.Example1;

public class OfflineOrderStore extends PhoneOrderTemplate{
    @Override
    void selectProduct() {
        System.out.println("selecting the product in offline store");
    }

    @Override
    void makePayment() {
        System.out.println("making the payment in offline store");
    }

    @Override
    void deliverProduct() {
        System.out.println("product delivered in hands in offline store");
    }
}
