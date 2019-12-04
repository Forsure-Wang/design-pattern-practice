package chapter1.operation;

public class Operation {
    private double numberA;
    private double numberB;

    public Operation() {
    }

    public Operation(double numA, double numB) {
        this.numberA = numA;
        this.numberB = numB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public double GetResult() /*throws ArithmeticException*/{
        double result = 0.0;

        return result;
    }
}
