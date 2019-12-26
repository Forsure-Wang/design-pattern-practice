package chapter8;

public class Main {
    public static void main(String[] args){
        /*LeiFeng xueleifeng = new Undergraduate();
        xueleifeng.Sweep();
        xueleifeng.Wash();
        xueleifeng.BuyRice();*/
        LeiFengFactory leiFengFactory = new UndergraduateFactory();
        LeiFeng student = leiFengFactory.CreateLeiFeng();
        student.Sweep();
        student.Wash();
        student.BuyRice();
    }
}
