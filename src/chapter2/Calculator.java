package chapter2;

public class Calculator {
    private double price = 0.0;
    private double amount = 0.0;

    public Calculator (double price, double amount) {
        this.price = price;
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getResult () {

        return price * amount;
    }
}
