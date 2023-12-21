package creational_patterns.factory_method;

public abstract class Factory {

    public final String create(String model){
        return this.createProduct(model);
    }

    protected abstract String createProduct(String model);
}
