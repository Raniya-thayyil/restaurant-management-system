package restaurantsystem;

import java.util.HashMap;

public class Restaurant {

    private String name;
    private Menu menu;

    HashMap<Customer, Order> orders = new HashMap<>();

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

    public boolean deliverOrderBy(Customer customer) {
        if (customer.Orders.isEmpty()) {
            return false;

        }
        for (Order order : customer.Orders) {
            order.setStatus("order delivered");
        }
        return true;

    }

}
