package creational_patterns.singleton;

public class Config {

    private static Config instance = null;

    protected Config() {
        System.out.println(instance);
    }

    public static Config getInstance() {
        if (instance == null) {
            synchronized (Config.class) {
                System.out.println("객체 생성");
                instance = new Config();
            }
        }
        System.out.println("객체 반환");
        return instance;
    }


}
