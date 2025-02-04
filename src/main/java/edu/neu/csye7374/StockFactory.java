package edu.neu.csye7374;

/**
 * @author Yesha
 */
public interface StockFactory {
    Stock createStock(String name, double price, String description);
}