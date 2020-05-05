package builder;

import java.util.ArrayList;

public class Form {
    private String title;
    private ArrayList components = new ArrayList();

    public void addTitle(String title) {
        this.title = title;
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    @Override
    public String toString() {
        return "Form{\n" +
                components.toString() + "\n" +
                '}';
    }
}
