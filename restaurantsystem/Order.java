package restaurantsystem;

import java.util.ArrayList;
import java.util.Random;

public class Order {
   
    private int numberOfItems;
    private double totalPrice;
    private String status;

    Random random = new Random();

    ArrayList<Bag> orderItems = new ArrayList<>();

    public Order() {        
        
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [numberOfItems=" + numberOfItems + ", totalPrice=" + totalPrice + ", status=" + status
                + ", orderItems=" + orderItems + "]";
    }

    
 
  
    

    

    
    
}
