package creational_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Monitor {

    List<Monitor> screen = new ArrayList<>();
    String name = "모니터";

    public void addMonitor(Monitor monitor) {
        screen.add(monitor);
    }

    public void show() {
        for (Monitor part : this.screen) {
            System.out.println(part.name);
        }
    }
}
