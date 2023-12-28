package creational_patterns.builder;

import java.util.List;

public class ProductModel extends Algorithm{

    public ProductModel() {
        this.composite = new Computer();
    }

    @Override
    Computer setCpu(String cpu) {
        System.out.println("CPU 설정 >> ");
        this.composite.cpu = cpu;
        return this.getInstance();
    }

    @Override
    Computer setRam(List<Memory> ram) {
        System.out.println("RAM 설정 >>");
        for (Memory memory : ram){
            System.out.println(memory.getSize() + "GB 장착");
            this.composite.ram.add(memory);
        }
        return this.composite;
    }

    @Override
    Computer setStorage(List<Storage> storage) {
        System.out.println("Storage 설정 >>");
        for (Storage sto : storage){
            System.out.println(sto.getSize() + "GB 장착");
            this.composite.storage.add(sto);
        }
        return this.composite;
    }
}
