package designPatterns.observerDesignPattern.observer;

import designPatterns.observerDesignPattern.observable.StockObservable;

public class MobileObserver implements StockObserver {

    StockObservable stockObservable;
    String email;

    public MobileObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Received massage on " + email + ": Iphone is in stock ");
    }
}
