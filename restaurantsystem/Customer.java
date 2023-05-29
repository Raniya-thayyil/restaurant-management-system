package restaurantsystem;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int age;
    private String gender;
    private String contact;

    private Bag bag;

    ArrayList<Order> Orders = new ArrayList<>();
    ArrayList<FoodItem> itemsToOrder = new ArrayList<>();

    public Customer(String name, int age, String gender, String contact) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean orderFood(Restaurant restaurant, Bag bag) {
        if (bag.itemstoOrder.isEmpty()) {
            return false;
        }
        Order order = new Order();

        order.orderItems.add(bag);
        order.setStatus("order placed");
        order.setTotalPrice(bag.getTotalprice());
        order.setNumberOfItems(bag.getTotalQuantity());

        this.Orders.add(order);        
        restaurant.orders.put(this, order);
        
        return true;

    }

    public Bag getBag() {
        return bag;
    }

    public boolean AddItems(Bag bag, Restaurant restaurant, ItemToOrder itemsToOrderdetail) {
        if (itemsToOrderdetail.customer != this) {
            return false;
        }

        if (restaurant.getMenu().nonvegItems.contains(itemsToOrderdetail.getItem()) || restaurant.getMenu().vegItems.contains(itemsToOrderdetail.getItem())) {
            bag.itemstoOrder.add(itemsToOrderdetail);
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", contact=" + contact + "]";
    }

    

}