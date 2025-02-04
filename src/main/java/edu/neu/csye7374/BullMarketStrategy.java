package edu.neu.csye7374;

public class BullMarketStrategy implements PriceCalculationStrategy {
    @Override
    public double calculateNewPrice(double currentPrice) {
        return currentPrice * 1.1; // Increase price by 10%
    }
}
