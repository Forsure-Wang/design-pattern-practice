package chapter8;

public class VolunteerFactory implements LeiFengFactory {
    @Override
    public LeiFeng CreateLeiFeng(){
        return new Volunteer();
    }
}
