package chapter8.Calculator;

import chapter1.operation.Operation;

public class Main {
    public static void main(String[] args){
        IFactory operFactory = new AddFactory();
        Operation operation = operFactory.CreateOperation();
        operation.setNumberA(1);
        operation.setNumberB(2);
        double result = operation.getResult();
        System.out.println(result);
    }
}
