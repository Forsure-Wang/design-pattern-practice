package chapter8.Calculator;

import chapter1.operation.Operation;
import chapter1.operation.OperationAdd;

public class AddFactory implements IFactory{
    @Override
    public Operation CreateOperation(){
        return new OperationAdd();
    }

}
