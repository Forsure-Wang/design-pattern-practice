package chapter1.operation;

public class OperationDivide extends Operation {
    public OperationDivide() {
    }

    public OperationDivide(double numA, double numB) {
        super(numA, numB);
    }

    @Override
    public double getResult() /*throws ArithmeticException*/ {
        double zeroB = getNumberB();

        //exeption
        if (zeroB == 0.0) {

            System.out.println("denominator can not be zero");
            //throw new Exception("除数不能为0");
            throw new ArithmeticException("除数不能为0");
        }
        double result = getNumberA() / getNumberB();
        return result;
    }
}
