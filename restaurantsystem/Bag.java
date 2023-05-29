package restaurantsystem;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Bag {

    Customer customer;

    // ArrayList<FoodItem> itemstoOrder = new ArrayList<>();
    HashMap<FoodItem, Integer> items = new HashMap<>();

    public Bag(Customer customer) {
        this.customer = customer;
    }

    public double getTotalprice() {
        double totalPrice = 0;
        // for (FoodItem items : this.itemstoOrder) {
        //     totalPrice += items.getPrice();
        // }
        
        for (Entry<FoodItem, Integer> item : items.entrySet()) {
            totalPrice += item.getValue() * item.getKey().getPrice();
            
        }

        return totalPrice;
    }
    public int getTotalQuantity() {
        int totalItems = 0;
        for (Entry<FoodItem, Integer> item : items.entrySet()) {
            totalItems += item.getValue();
            
        }
        return totalItems;

    }

    @Override
    public String toString() {
        return "[items:" +  items + "]";
    }

    



}
