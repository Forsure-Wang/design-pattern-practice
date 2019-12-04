package chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        String strA = "";
        String operater = "";
        String strB = "";
        try {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input number A:");
            strA = stdin.readLine();

            System.out.println("input chapter1.Calculator:");
            operater = stdin.readLine();

            System.out.println("input number B:");
            strB = stdin.readLine();

        } catch (IOException e) {
            System.out.println("IO exception");
        }

        double numberA = Double.parseDouble(strA);
        double numberB = Double.parseDouble(strB);
        double result = 0;
        Calculator calculator = new Calculator();

        /*switch (operater) {
            case "+":
                result = calculator.add(numberA, numberB);
                System.out.println("the result is: " + result);
                break;
            case "-":
                result = calculator.substract(numberA, numberB);
                System.out.println("the result is: " + result);
                break;
            case "*":
                result = calculator.multiply(numberA, numberB);
                System.out.println("the result is: " + result);
                break;
            case "/":

                try {
                    result = calculator.divide(numberA, numberB);
                } catch (Exception e) {
                    //e.printStackTrace();
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                System.out.println("the result is: " + result);
                break;
            default:
                    System.out.println("please input operater in +,-,*,/");
        }*/
        /*try {
            result = calculator.getResult(numberA, numberB, operater);
            System.out.println("the result is: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        result = calculator.getResult(numberA, numberB, operater);
        System.out.println("the result is: " + result);


    }
}
