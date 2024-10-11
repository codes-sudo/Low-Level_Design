package org.example.learning.Strategy.Example1;

public class DebitCardPayment implements PaymentStrategy{
    // Individual class payment processing logic
    @Override
    public void processPayment() {
        System.out.println("Processing Payment Using... " + PaymentType.DEBIT_CARD);
    }
}
