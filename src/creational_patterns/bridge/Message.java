package creational_patterns.bridge;

public class Message extends Language{

    public Message(Hello language) {
        this.language = language;
    }

    @Override
    String greeting() {
        // 브리지 구현
        return this.language.greeting();
    }
}
