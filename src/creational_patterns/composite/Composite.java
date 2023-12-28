package creational_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    public List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super.setName(name);
    }

    public void addNode(Component folder) {
        children.add(folder);
    }

    public void removeNode(Component component) {
        children.remove(component);
    }

    public boolean isNode(Component component){
        return this.children.contains(component);
    }


}
