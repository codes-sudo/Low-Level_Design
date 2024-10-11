package org.example.learning.Observable.Example3.Observable;

import org.example.learning.Observable.Example3.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {

    }

    @Override
    public void remove(NotificationAlertObserver observer) {

    }

    @Override
    public void notifySubscribers() {
       for (NotificationAlertObserver observer: observerList) {
           observer.update();
       }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0){
            notifySubscribers();
        }

        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
