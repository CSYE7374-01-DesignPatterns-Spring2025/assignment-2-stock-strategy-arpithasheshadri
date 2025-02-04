package edu.neu.csye7374;

public class Demo {
	
	
	

	public static void demo() {
        StockFactory ibmFactory = new IBMStockFactory();
        StockFactory gmFactory = new GMStockFactory();

        Stock ibmStock = ibmFactory.createStock("IBM", 150.0, "IBM Corp Stock");
        Stock gmStock = gmFactory.createStock("GM", 75.0, "General Motors Stock");

        System.out.println("Regular Factory IBMStock: " + ibmStock);
        System.out.println("Regular Factory GMStock: " + gmStock);

        StockFactory lazyIbmFactory = LazyIBMStockFactory.getInstance();
        StockFactory eagerGmFactory = EagerGMStockFactory.getInstance();

        Stock lazyIbmStock = lazyIbmFactory.createStock("IBM Lazy", 155.0, "Lazy IBM Stock");
        Stock eagerGmStock = eagerGmFactory.createStock("GM Eager", 80.0, "Eager GM Stock");

        System.out.println("Lazy Singleton IBMStock: " + lazyIbmStock);
        System.out.println("Eager Singleton GMStock: " + eagerGmStock);

        ibmStock.setStrategy(new BullMarketStrategy());
        gmStock.setStrategy(new BearMarketStrategy());

        System.out.println("\nInitial Prices:\n");
        System.out.println("IBMStock: "+ibmStock);
        System.out.println("GMStock: "+gmStock);

        ibmStock.updatePrice();
        gmStock.updatePrice();

        System.out.println("\nUpdated Prices after applying Strategies:\n");
        System.out.println("IBMStock: "+ibmStock);
        System.out.println("GMStock: "+gmStock);


    }

}
