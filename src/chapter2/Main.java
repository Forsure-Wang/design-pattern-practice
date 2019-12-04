package chapter2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arge) {
        System.out.println("Chapter 2 !!!");

        String strPrice = "";
        String strAmount = "";
        final double PERCENT = 0.8;
        double result = 0.0;
        double totalPrice = 0.0;


        try {
            System.out.println("Please input price:");
            BufferedReader stdinPrice = new BufferedReader(new InputStreamReader(System.in));
            strPrice = stdinPrice.readLine();

            System.out.println("Please input amount:");
            BufferedReader stdinAmount = new BufferedReader(new InputStreamReader(System.in));
            strAmount = stdinAmount.readLine();
        }catch (IOException e){
            System.out.println("Error: IOException");
        }

        double doublePrice = Double.parseDouble(strPrice);
        double doubleAmount = Double.parseDouble(strAmount);
        Calculator calculator = new Calculator(doublePrice, doubleAmount);
        result = calculator.getResult();

        Discount discount = new Discount(result, PERCENT);
        totalPrice = discount.getResult();

        System.out.println("Total price:" + totalPrice);
    }

}
