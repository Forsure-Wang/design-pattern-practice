package chapter8.Calculator;

import chapter1.operation.Operation;
import chapter1.operation.OperationMultiply;

public class DivFactory implements IFactory {
    @Override
    public Operation CreateOperation(){
        return new OperationMultiply();
    }
}
