public class Calculator {
    public float getResult(float numA, float numB, String opt){
        // check the input
        float numberA = numA;
        float numberB = numB;
        String operater = opt;
        float result = 0;

        switch(operater){
            case "+":
                result = add(numberA, numberB);
                break;
            case "-":
                result = substract(numberA, numberB);
                break;
            case "*":
                result = multiply(numberA, numberB);
                break;
            case"/":
                try {
                    result = divide(numberA, numberB);
                } catch (Exception e) {
                    //e.printStackTrace();
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("pleas input operater in +,-,*,/");
        }

        return result;
    }

    public float add(float numberA, float numberB) {
        return numberA + numberB;
    }

    public float substract (float numberA, float numberB) {
        return numberA - numberB;
    }

    public float multiply (float numberA, float numberB) {
        return numberA * numberB;
    }

    public float divide (float numberA, float numberB) throws Exception {
        if (numberB == 0.0) {
            throw new Exception("除数不能为0");
        }
        return numberA / numberB;
    }
}
