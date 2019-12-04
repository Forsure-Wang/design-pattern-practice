import operation.*;

public class Calculator {

    public double getResult(double numA, double numB, String opt) {
        // check the input
        double numberA = numA;
        double numberB = numB;
        String operator = opt;
        double result = 0.0;


        /*switch (operator) {
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
                //result = multiply(numberA, numberB);
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
                System.out.println("pleas input operator in +,-,*,/");
                throw new RuntimeException("Error: wrong operator");
        }*/

        //simple factory design pattern

        //static method (createOperate) can be called independently without an object
        Operation operation = null;
        operation = OperationFactory.createOperate(operator);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        result = operation.GetResult();

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
