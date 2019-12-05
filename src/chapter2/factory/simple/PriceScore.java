package chapter2.factory.simple;

public class PriceScore extends Price {
    private double condition = 0.0;
    private double score = 0.0;

    public PriceScore(double price, double amount, double condition, double score) {
        super(price, amount);
        this.condition = condition;
        this.score = score;
    }

    public double getCondition() {
        return condition;
    }

    public void setCondition(double condition) {
        this.condition = condition;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public double getResult() {
        double totalPrice = super.getResult();
        double totalScore = 0.0;
        if (totalPrice >= condition) {
            totalScore = totalPrice / condition * score;
            System.out.println("Congratulations! you have gained " + totalScore + " score");
            //save total price into database;
        }
        return totalPrice;
    }

}
