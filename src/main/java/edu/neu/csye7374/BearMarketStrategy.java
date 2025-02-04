package edu.neu.csye7374;

public class BearMarketStrategy implements PriceCalculationStrategy {
    @Override
    public double calculateNewPrice(double currentPrice) {
        return currentPrice * 0.9; // Decrease price by 10%
    }
}
