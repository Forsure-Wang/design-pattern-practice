import operation.OperationAdd;
import operation.OperationDivide;
import operation.OperationMultiply;
import operation.OperationSubstract;

public class Calculator {
    public double getResult(double numA, double numB, String opt) {
        // check the input
        double numberA = numA;
        double numberB = numB;
        String operater = opt;
        double result = 0.0;


        switch (operater) {
            case "+":
                //result = add(numberA, numberB);
                OperationAdd operationAdd = new OperationAdd(numberA, numberB);
                result = operationAdd.GetResult();
                break;
            case "-":
                //result = substract(numberA, numberB);
                OperationSubstract operationSubstract = new OperationSubstract(numberA, numberB);
                result = operationSubstract.GetResult();
                break;
            case "*":
                //ltiply(numberA, numberB);
                OperationMultiply operationMultiply = new OperationMultiply(numberA, numberB);
                result = operationMultiply.GetResult();
                break;
            case "/":
                try {
                    //result = divide(numberA, numberB);
                    OperationDivide operationDivide = new OperationDivide(numberA, numberB);
                    result = operationDivide.GetResult();
                } catch (ArithmeticException e) {
                    //e.printStackTrace();
                    System.out.println("Error: " + e.getMessage());
                    throw new ArithmeticException(e.getMessage());
                }
                break;
            default:
                System.out.println("pleas input operater in +,-,*,/");
                throw new RuntimeException("Error: wrong operater");
        }

        return result;
    }

    /*public double add(double numberA, double numberB) {
        return numberA + numberB;
    }

    public double substract(double numberA, double numberB) {
        return numberA - numberB;
    }

    public double multiply(double numberA, double numberB) {
        return numberA * numberB;
    }

    public double divide(double numberA, double numberB) throws Exception {
        if (numberB == 0.0) {
            throw new Exception("除数不能为0");
        }
        return numberA / numberB;
    }*/
}
