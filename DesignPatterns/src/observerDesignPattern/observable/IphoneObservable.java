package observerDesignPattern.observable;

import observerDesignPattern.observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable {
    List<StockObserver> stockObservers = new ArrayList<>();
    int stock = 0;

    @Override
    public void add(StockObserver stockObserver) {
        stockObservers.add(stockObserver);
    }

    @Override
    public void remove(StockObserver stockObserver) {
        stockObservers.remove(stockObserver);
    }

    @Override
    public void notifyToObservers() {
        for (StockObserver stockObserver : stockObservers) {
            stockObserver.update();
        }
    }

    @Override
    public void addToStock(int stock) {
        if(stock != 0){
            notifyToObservers();
        }
        this.stock+=stock;
    }
}
