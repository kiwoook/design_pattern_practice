package creational_patterns.builder;

public class Storage {
    private int size;

    public Storage() {
        this.size = 0;
    }

    public Storage(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
