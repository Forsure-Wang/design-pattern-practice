package chapter1.operation;

public class OperationAdd extends Operation {
    public OperationAdd() {

    }

    public OperationAdd(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public double getResult() {

        double result = getNumberA() + getNumberB();
        return result;
    }
}
