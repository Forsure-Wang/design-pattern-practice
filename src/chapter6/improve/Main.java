package chapter6.improve;

public class Main {
    public static void main(String[] args){
        Person Tom = new Person("Tom");

        System.out.println("The first dress");

        BigTrouser bigTrouser1 = new BigTrouser();
        TShirts tShirts1 = new TShirts();

        bigTrouser1.Decorate(Tom);
        tShirts1.Decorate(bigTrouser1);
        tShirts1.Show();

        System.out.println("The second dress");

        TShirts tShirts2 = new TShirts();
        BigTrouser bigTrouser2 = new BigTrouser();

        tShirts2.Decorate(Tom);
        bigTrouser2.Decorate(tShirts2);
        bigTrouser2.Show();
    }
}
