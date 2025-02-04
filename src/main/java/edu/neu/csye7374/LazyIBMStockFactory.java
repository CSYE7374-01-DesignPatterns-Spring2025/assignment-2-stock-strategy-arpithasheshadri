package edu.neu.csye7374;

public class LazyIBMStockFactory implements StockFactory {
    private static LazyIBMStockFactory instance;

    private LazyIBMStockFactory() {}

    public static synchronized LazyIBMStockFactory getInstance() {
        if (instance == null) {
            instance = new LazyIBMStockFactory();
        }
        return instance;
    }

    @Override
    public Stock createStock(String name, double price, String description) {
        return new IBMStock(name, price, description);
    }
}
