package org.example.learning.Observable.Example3.Observer;

import org.example.learning.Observable.Example3.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String email;
    StockObservable stockObservable;

    public EmailAlertObserverImpl(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(email, "product is in the stock");
    }

    private void sendEmail(String email, String productIsInTheStock) {
        System.out.println("email sent to "+ email);
    }
}
