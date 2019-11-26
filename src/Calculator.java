public class Calculator {
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
