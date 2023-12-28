package creational_patterns.builder;

import java.util.List;

public class Factory extends Builder {


    public Factory() {
        this.algorithm = null;
    }

    public Factory(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public Builder build() {
        System.out.println(" === 빌드 ====");
        this.algorithm.setCpu("i7");
        this.algorithm.setRam(List.of(new Memory(8),new Memory(8)));
        this.algorithm.setStorage(List.of(new Storage(256),new Storage(512)));
        return this;
    }
}
