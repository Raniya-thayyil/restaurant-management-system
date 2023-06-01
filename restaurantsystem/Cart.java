package restaurantsystem;

import java.util.ArrayList;

public class Cart {

    Customer customer;

    ArrayList<ItemToOrder> itemstoOrder = new ArrayList<>();   

    public Cart(Customer customer) {
        this.customer = customer;
    }
   
    @Override
    public String toString() {
        return "Cart [customer=" + customer + ", foodItems=" + itemstoOrder + "]";
    }  

}