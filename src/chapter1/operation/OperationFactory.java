package chapter1.operation;

public class OperationFactory {
    public static Operation createOperate (String operator){
        Operation operation = null;
        switch (operator) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSubstract();
                break;
            case "*":
                operation = new OperationMultiply();
                break;
            case "/":
                /*try {
                    chapter1.operation = new OperationDivide();
                } catch (ArithmeticException e) {
                    //e.printStackTrace();
                    System.out.println("Error: " + e.getMessage());
                    throw new ArithmeticException(e.getMessage());
                }*/
                operation = new OperationDivide();
                break;
            default:
                System.out.println("pleas input operater in +,-,*,/");
                throw new RuntimeException("Error: wrong operater");
        }

        return operation;
    }
}
