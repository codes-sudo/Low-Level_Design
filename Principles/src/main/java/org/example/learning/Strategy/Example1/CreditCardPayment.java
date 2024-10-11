package org.example.learning.Strategy.Example1;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("Processing Payment Using... " + PaymentType.CREDIT_CARD);
    }
}
