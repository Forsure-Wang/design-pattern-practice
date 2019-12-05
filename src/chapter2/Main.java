package chapter2;

import chapter2.factory.simple.Price;
import chapter2.factory.simple.PriceFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] arge) {
        System.out.println("Chapter 2 !!!");

        String strPrice = "";
        String strAmount = "";
        String strategy = "";
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

            System.out.println("Please input strategy:");
            BufferedReader stdinStrategy = new BufferedReader(new InputStreamReader(System.in));
            strategy = stdinStrategy.readLine();

        }catch (IOException e){
            System.out.println("Error: IOException");
        }

        double doublePrice = Double.parseDouble(strPrice);
        double doubleAmount = Double.parseDouble(strAmount);
        //Calculator calculator = new Calculator(doublePrice, doubleAmount);
        //result = calculator.getResult();


        //Discount discount = new Discount(result, PERCENT);
        //totalPrice = discount.getResult();


        Price priceObj = PriceFactory.createPriceStrategy(doublePrice, doubleAmount, strategy);
        totalPrice = priceObj.getResult();

        System.out.println("Total price:" + totalPrice);
    }

}
