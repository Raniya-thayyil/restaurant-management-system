package restaurantsystem;

import java.util.ArrayList;

public class BaseCart {

    Customer customer;

    ArrayList<ItemToOrder> orderItems = new ArrayList<>();

    public int getTotalQuantity() {
        int totalItems = 0;

        for (ItemToOrder items : this.orderItems) {
            totalItems += items.getnumberOfItem();
        }
        return totalItems;
    }

    public double getTotalprice() {
        double totalPrice = 0;
        for (ItemToOrder items : this.orderItems) {
            totalPrice += items.getItem().getPrice() * items.getnumberOfItem();
        }
        return totalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
