package org.example.learning.Observable.Example3.Observer;

import org.example.learning.Observable.Example3.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable stockObservable;

    public MobileAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMsg(userName, "product is in the stock");
    }

    private void sendMsg(String userName, String msg) {
        System.out.println("Msg sent to "+ userName);
    }
}
