package creational_patterns.abstract_factory;

public class KoreaFactory extends Factory {

    public KoreaFactory() {
        System.out.println("Korea Factory 객체 생성");
    }

    @Override
    public String createTire() {
        return new KoreaTireProduct().makeAssemble();
    }

    @Override
    public String createDoor() {
        return new KoreaDoorProduct().makeAssemble();
    }
}
