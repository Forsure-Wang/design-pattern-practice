package chapter8;

public class UndergraduateFactory implements LeiFengFactory {
    @Override
    public LeiFeng CreateLeiFeng(){
        return new Undergraduate();
    }
}
