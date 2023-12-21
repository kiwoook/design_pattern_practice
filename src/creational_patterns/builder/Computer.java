package creational_patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private String cpu;

    private List<Memory> ram = new ArrayList<>();

    private List<Storage> storage = new ArrayList<>();

    public Computer() {
        System.out.println("Computer 객체 생성");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }

    public int memory() {

        int size = 0;

        for (Memory memory : ram) {
            size += memory.getSize();
        }

        return size;
    }

    public int storage() {
        int size = 0;

        for (Storage storage : storage){
            size += storage.getSize();
        }

        return size;
    }
}
