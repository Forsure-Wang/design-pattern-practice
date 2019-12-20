package chapter6;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("Operation of Decorator's object B");
    }

    private void AddedBehavior(){

    }
}
