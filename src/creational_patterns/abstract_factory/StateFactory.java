package creational_patterns.abstract_factory;

public class StateFactory extends Factory{

    public StateFactory() {
        System.out.println("stateFactory 객체 생성");
    }

    @Override
    public String createTire() {
        return null;
    }

    @Override
    public String createDoor() {
        return null;
    }
}
