package creational_patterns.composite;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.setMonitor(new Monitor());

        computer.monitor.addMonitor(new Monitor32());
        computer.monitor.addMonitor(new Monitor32());

        computer.setDisk(new Disk());
        computer.setMemory(new Memory());

        System.out.println(computer.name);
        System.out.println(computer.disk);
        System.out.println(computer.memory);
        computer.monitor.show();

    }
}
