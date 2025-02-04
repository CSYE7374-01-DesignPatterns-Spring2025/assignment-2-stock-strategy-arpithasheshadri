package edu.neu.csye7374;

public class EagerGMStockFactory implements StockFactory {
    private static final EagerGMStockFactory instance = new EagerGMStockFactory();

    private EagerGMStockFactory() {}

    public static EagerGMStockFactory getInstance() {
        return instance;
    }

    @Override
    public Stock createStock(String name, double price, String description) {
        return new GMStock(name, price, description);
    }
}