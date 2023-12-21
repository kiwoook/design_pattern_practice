package creational_patterns.singleton;

public class Index {

    public static void main(String[] args) {
        Config config  = Config.getInstance();
        Config config2 = Config.getInstance();


        Env env1 = new Env();
        Env env2 = Env.getInstance();
    }
}
