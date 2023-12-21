package creational_patterns.abstract_factory;

public class KoreaDoorProduct extends DoorProduct {

    public KoreaDoorProduct() {
        System.out.println("한국 도어 객체 생성");
    }

    @Override
    public String makeAssemble() {
        return "한국 도어 장착";
    }
}
