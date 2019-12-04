package chapter2;

public class Discount {
    private double price = 0.0;
    private double discount = 0.0;

    public Discount(double number, double percent){
        this.price = number;
        this.discount = percent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getResult(){
        return price * discount;
    }
}
