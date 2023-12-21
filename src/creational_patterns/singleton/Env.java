package creational_patterns.singleton;

public class Env extends Config{

    protected static Env instance = null;

    public static Env getInstance() {
        if (instance == null) {
            synchronized (Config.class) {
                System.out.println(" env 객체 생성");
                instance = new Env();
            }
        }
        System.out.println("env x`객체 반환");
        return instance;
    }
}
