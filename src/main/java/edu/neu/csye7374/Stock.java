package edu.neu.csye7374;
import java.util.ArrayList;
import java.util.List;

public abstract class Stock {
    protected String name;
    protected double price;
    protected String description;
    protected PriceCalculationStrategy strategy;

    public Stock(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStrategy(PriceCalculationStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void updatePrice() {
        if (strategy != null) {
            price = strategy.calculateNewPrice(price);
        } else {
            System.out.println("No strategy set for stock: " + name);
        }
    }



    @Override
    public String toString() {
        return "Stock name = " + name +
               ", Stock price = " + price +
               ", Stock description = " + description;
    }
}
