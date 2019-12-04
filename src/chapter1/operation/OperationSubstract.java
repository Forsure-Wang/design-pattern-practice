package chapter1.operation;

public class OperationSubstract extends Operation {
    public OperationSubstract() {
    }

    public OperationSubstract(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public double getResult() {
        double result = getNumberA() - getNumberB();
        return result;
    }
}
