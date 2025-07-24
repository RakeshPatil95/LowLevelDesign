package designPatterns.observerDesignPattern.observable;

import designPatterns.observerDesignPattern.observer.StockObserver;

public interface StockObservable {

    public void add(StockObserver stockObserver);
    public void remove(StockObserver stockObserver);
    public void notifyToObservers();
    public void addToStock(int stock);
}
