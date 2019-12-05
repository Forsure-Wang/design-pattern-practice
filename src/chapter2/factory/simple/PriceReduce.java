package chapter2.factory.simple;

public class PriceReduce extends Price {
    private double condition = 0.0;
    private double reduce = 0.0;


    public PriceReduce(double price, double amount, double condition, double reduce) {
        super(price, amount);
        this.condition = condition;
        this.reduce = reduce;
    }

    public double getCondition() {
        return condition;
    }

    public void setCondition(double condition) {
        this.condition = condition;
    }

    public double getReduce() {
        return reduce;
    }

    public void setReduce(double reduce) {
        this.reduce = reduce;
    }

    @Override
    public double getResult() {
        double totalPrice = 0.0;
        totalPrice = this.getPrice() * this.getAmount();
        if (totalPrice >= condition) {
            //System.out.println(Math.floor(totalPrice / condition));
            //System.out.println(totalPrice / condition * reduce);
            totalPrice = totalPrice - Math.floor(totalPrice / condition) * reduce;
        }
        return totalPrice;

    }
}
