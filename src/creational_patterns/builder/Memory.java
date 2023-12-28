package creational_patterns.builder;

public class Memory {

    private int size;

    public Memory(){
        this.size = 0;
    }

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
