package chapter8;

public class SimpleFactory {
    public static LeiFeng CreateLeiFeng(String type){
        LeiFeng result = null;
        switch(type){
            case "undergraduate":
                result = new Undergraduate();
                break;
            case "volunteer":
                result = new Volunteer();
                break;
        }
        return result;
    }
}
