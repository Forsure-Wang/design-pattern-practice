package operation;

public class OperationSubstract extends Operation {
    public OperationSubstract(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public double GetResult() {
        double result = getNumberA() - getNumberB();
        return result;
    }
}
