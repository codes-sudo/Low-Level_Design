package org.example.learning.Strategy.Example1;

public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.processCheckout(new DebitCardPayment());
        checkout.processCheckout(new UPIPayment());
    }
}
