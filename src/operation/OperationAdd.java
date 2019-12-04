package operation;

public class OperationAdd extends Operation {
    public OperationAdd() {

    }

    public OperationAdd(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public double GetResult() {

        double result = getNumberA() + getNumberB();
        return result;
    }
}
