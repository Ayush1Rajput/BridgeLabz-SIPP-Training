package StreamAPI.ForEachMethod.StockPriceLogger;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(102.5, 105.8, 110.2, 108.7, 115.0);

        System.out.println("Stock Price Updates:");
        stockPrices.forEach(price -> System.out.println("Current Stock Price: Rs." + price));
    }
}

