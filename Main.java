package phone;

public class Main {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone(5, true, true);
        iPhone.call("555-555-555");
        System.out.println("iphone calls = " + iPhone.getPhoneCalls());
        iPhone.call("555-555-555");
        iPhone.call("555-555-555");
        iPhone.call("555-555-555");
        iPhone.call("555-555-555");
        System.out.println("iphone calls = " + iPhone.getPhoneCalls());
    }

}
