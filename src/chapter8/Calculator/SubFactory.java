package chapter8.Calculator;

import chapter1.operation.Operation;
import chapter1.operation.OperationSubstract;

public class SubFactory implements IFactory {
    @Override
    public Operation CreateOperation(){
        return new OperationSubstract();
    }
}
