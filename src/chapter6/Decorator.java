package chapter6;

abstract public class Decorator extends Component {
    protected Component component;

    //set Component
    public void SetComponent(Component component) {
        this.component = component;
    }

    //override Operation(), excute Component's Operaion actrually

    @Override
    public void Operation() {
        if (component != null){
            component.Operation();
        }
    }
}
