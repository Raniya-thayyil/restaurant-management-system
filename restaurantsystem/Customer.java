package restaurantsystem;

import java.util.ArrayList;

public class Customer {
    private String name;
    private int age;
    private String gender;
    private Bag bag;

    ArrayList<Order> Orders = new ArrayList<>();
    ArrayList<FoodItem> itemsToOrder = new ArrayList<>();

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public Order orderFood(Bag bag) {         
        
        Order order = new Order();
        order.orderItems.add(bag);
        order.setStatus("order placed");
        order.setTotalPrice(bag.getTotalprice());
        order.setNumberOfItems(bag.getTotalQuantity());
        this.Orders.add(order);
        return order;

    }

   

    public Bag getBag() {
        return bag;
    }

    public void AddItems(Bag bag, Restaurant restaurant, FoodItem item, int quantity) {
        
        if (restaurant.getMenu().nonvegItems.contains(item) || restaurant.getMenu().vegItems.contains(item)) {
            bag.items.put(item, quantity);
        }
       
    }

    


    
}
