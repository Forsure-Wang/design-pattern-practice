package operation;

public class OperationMultiply extends Operation {
    public OperationMultiply(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public double GetResult() {
        double result = getNumberA() * getNumberB();
        return result;
    }
}
