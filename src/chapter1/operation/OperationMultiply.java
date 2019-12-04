package chapter1.operation;

public class OperationMultiply extends Operation {
    public OperationMultiply() {
    }

    public OperationMultiply(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public double getResult() {
        double result = getNumberA() * getNumberB();
        return result;
    }
}
