package creational_patterns.builder;

import java.util.List;

public abstract class Algorithm {

    protected Computer composite;

    abstract Computer setCpu(String cpu);

    abstract Object setRam(List<Memory> ram);

    abstract Object setStorage(List<Storage> storage);

    public Computer getInstance() {
        return this.composite;
    }
}
