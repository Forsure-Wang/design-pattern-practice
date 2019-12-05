package chapter2.factory.simple;

public class PriceFactory {
    public static Price createPriceStrategy(double price, double amount, String strategy) {
        Price priceObj = null;
        switch (strategy) {
            case "normal":
                priceObj = new Price(price, amount);
                break;
            case "discount":
                priceObj = new PriceDiscount(price, amount, 0.8);
                break;
            case "reduce":
                priceObj = new PriceReduce(price, amount, 300, 150);
                break;
            case "score":
                priceObj = new PriceScore(price, amount, 100, 10);
                break;
            default:
                System.out.println("Out of strategy");
                throw new RuntimeException("Error: Out of strategy");
        }
        return priceObj;
    }
}
