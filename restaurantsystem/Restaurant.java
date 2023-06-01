package restaurantsystem;

import java.util.ArrayList;

import java.util.ArrayList;




public class Restaurant {

    private String name;
    private Menu menu;

    ArrayList<Order> orderDetails = new ArrayList<>();


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
        if (customer.orders.isEmpty()) {
            return false;

        }
        for (Order order : customer.orders) {
            order.setStatus(OrderStatus.ORDER_DELIVERED);
        }
        return true;
    }

}