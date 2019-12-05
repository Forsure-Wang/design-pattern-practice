package chapter2.factory.strategy;

import chapter2.factory.simple.Price;
import chapter2.factory.simple.PriceDiscount;
import chapter2.factory.simple.PriceReduce;
import chapter2.factory.simple.PriceScore;

public class PriceContext {
    Price priceObj = null;

    public PriceContext (double price, double amount, String strategy) {

        switch (strategy) {
            case "normal":
                priceObj = new Price(price, amount);
                break;
            case "reduce":
                priceObj = new PriceReduce(price, amount,300, 150);
                break;
            case "discount":
                priceObj = new PriceDiscount(price, amount, 0.8);
                break;
            case "score":
                priceObj = new PriceScore(price, amount, 100, 10);
                break;
            default:
                System.out.println("Error: Out of strategy");
                throw new RuntimeException("Error: Out of strategy");
        }
    }

    public double getResult () {
        return priceObj.getResult();
    }
}
