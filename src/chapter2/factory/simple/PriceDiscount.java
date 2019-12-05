package chapter2.factory.simple;

public class PriceDiscount extends Price {
    private double discount = 0.0;


    public PriceDiscount(double price, double amount, double discount) {
        super(price, amount);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double getResult() {
        return this.getPrice() * this.getAmount() * discount;
    }
}
