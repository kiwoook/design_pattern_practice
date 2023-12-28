package creational_patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    public String cpu;

    public List<Memory> ram = new ArrayList<>();

    public List<Storage> storage = new ArrayList<>();

    public Computer() {
        System.out.println("Computer 객체 생성");
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + getSizeMemory() +
                ", storage=" + getSizeStorage() +
                '}';
    }

    public int getSizeMemory() {

        int size = 0;

        for (Memory memory : ram) {
            size += memory.getSize();
        }

        return size;
    }

    public int getSizeStorage() {
        int size = 0;

        for (Storage storage : storage){
            size += storage.getSize();
        }

        return size;
    }
}
