package creational_patterns.bridge;

public class English implements Hello{
    @Override
    public String greeting() {
        return "hello";
    }
}
