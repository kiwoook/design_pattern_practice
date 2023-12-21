package creational_patterns.abstract_factory;

public class KoreaTireProduct extends TireProduct{
    public KoreaTireProduct() {
        System.out.println("한국 타이어 객체 생성");
    }


    @Override
    public String makeAssemble() {
        return "한국 타이어 장착";
    }
}
