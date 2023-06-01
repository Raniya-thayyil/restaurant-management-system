package restaurantsystem;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int age;
    private String gender;
    private String contact;

    private Cart bag;

    ArrayList<Order> orders = new ArrayList<>();

    public Customer(String name, int age, String gender, String contact) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
        this.bag = new Cart(this);
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setBag(Cart bag) {
        this.bag = bag;
    }

    public Cart getBag() {
        return bag;
    }

    public void orderFood(Restaurant restaurant) {
        Order order = new Order(this);

        order.orderItems = this.bag.orderItems;
        order.setStatus(OrderStatus.ORDER_PLACED.getOrderStatus());

        restaurant.orderDetails.add(order);

        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", contact=" + contact + "]";
    }

    

}