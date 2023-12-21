package creational_patterns.factory_method;

public class ProductFactory extends Factory {
    @Override
    protected String createProduct(String model) {
        if (model.equals("LG")) {
            return new LgProduct().name();
        } else if (model.equals("SAMSUNG")) {
            return new SamsungProduct().name();
        }
        return null;
    }
}
