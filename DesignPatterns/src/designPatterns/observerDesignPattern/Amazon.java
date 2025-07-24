package designPatterns.observerDesignPattern;

import designPatterns.observerDesignPattern.observable.IphoneObservable;
import designPatterns.observerDesignPattern.observable.StockObservable;
import designPatterns.observerDesignPattern.observer.EmailObserver;
import designPatterns.observerDesignPattern.observer.MobileObserver;
import designPatterns.observerDesignPattern.observer.StockObserver;

public class Amazon {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();
        StockObserver stockObserver1 = new EmailObserver("abc@gmail.com", iphoneObservable);
        StockObserver stockObserver2 = new EmailObserver("qwe@gmail.com", iphoneObservable);
        StockObserver stockObserver3 = new EmailObserver("rty@gmail.com", iphoneObservable);

        StockObserver stockObserver4 = new MobileObserver("hjk@gmail.com", iphoneObservable);
        StockObserver stockObserver5 = new MobileObserver("nbv@gmail.com", iphoneObservable);
        StockObserver stockObserver6 = new MobileObserver("plk@gmail.com", iphoneObservable);

        iphoneObservable.add(stockObserver1);
        iphoneObservable.add(stockObserver2);
        iphoneObservable.add(stockObserver3);
        iphoneObservable.add(stockObserver4);
        iphoneObservable.add(stockObserver5);
        iphoneObservable.add(stockObserver6);

        iphoneObservable.addToStock(10);
        iphoneObservable.addToStock(0);
        iphoneObservable.addToStock(100);


    }
}
