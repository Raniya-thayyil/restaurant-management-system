package restaurantsystem;

<<<<<<< HEAD
import java.util.HashMap;
=======
import java.util.ArrayList;
>>>>>>> f6656e8 (items added)

public class Restaurant {

    private String name;
    private Menu menu;
    
    ArrayList<Order> orders = new ArrayList<>();

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
