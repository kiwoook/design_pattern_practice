package creational_patterns.bridge;

public class Korean implements Hello{
    @Override
    public String greeting() {
        return "안녕하세요";
    }
}
