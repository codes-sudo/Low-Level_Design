package org.example.learning.Strategy.Example1;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing Payment Using... " + PaymentType.UPI);
    }
}
