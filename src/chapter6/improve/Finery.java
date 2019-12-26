package chapter6.improve;

public class Finery extends Person{
    protected Person component;

    public void Decorate (Person component){
        this.component = component;
    }

    @Override
    public void Show(){
        if(component != null){
            component.Show();
        }
    }
}
