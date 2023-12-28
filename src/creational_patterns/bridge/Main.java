package creational_patterns.bridge;

public class Main {

    public static void main(String[] args) {

        Message msg = new Message(new Korean());
        System.out.println(msg.greeting());

        msg = new Message(new English());
        System.out.println(msg.greeting());
    }
}
