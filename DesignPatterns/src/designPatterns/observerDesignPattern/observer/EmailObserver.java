package designPatterns.observerDesignPattern.observer;

import designPatterns.observerDesignPattern.observable.StockObservable;

public class EmailObserver implements StockObserver {
    StockObservable stockObservable;
    String email;

    public EmailObserver(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Received mail to" + email + ": Iphone is in stock");
    }
}
