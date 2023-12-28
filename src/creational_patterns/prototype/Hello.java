package creational_patterns.prototype;

public class Hello {
    private String message;

    public Hello(String message) {
        System.out.println(Hello.class + "객체 생성");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
