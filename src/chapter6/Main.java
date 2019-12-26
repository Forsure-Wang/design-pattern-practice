package chapter6;

public class Main {

    public static void main(String[] args){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA a = new ConcreteDecoratorA();
        ConcreteDecoratorB b = new ConcreteDecoratorB();

        System.out.println("SetComponent c");
        a.SetComponent(c);

        System.out.println("SetComponent a");
        b.SetComponent(a);

        System.out.println("b.Operation");
        b.Operation();

    }
}
