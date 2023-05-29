package restaurantsystem;

import java.util.ArrayList;

public class Restaurant {

    private String name;
    private Menu menu;
    
    ArrayList<Order> orders = new ArrayList<>();

    public Restaurant(String name, Menu menu) {
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    
    
}
