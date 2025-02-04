package edu.neu.csye7374;

public interface Tradeable0 extends Tradeable{
    @Override
    default void setBid(String bidString) {
        try {
            double bid = Double.parseDouble(bidString);
            System.out.println("Bid received: " + bid);
        } catch (NumberFormatException e) {
            System.out.println("Invalid bid: " + bidString);
        }
    }
    @Override
    default String getMetric() {
        return "Default Metric";
    }
}
