package restaurantsystem;

import java.util.ArrayList;

public class Bag {

    Customer customer;

    ArrayList<ItemToOrder> itemstoOrder = new ArrayList<>();

    public Bag(Customer customer) {
        this.customer = customer;
    }

    public double getTotalprice() {
        double totalPrice = 0;
        for (ItemToOrder items : this.itemstoOrder) {
            totalPrice += items.getItem().getPrice() * items.getnumberOfItem();
        }

        return totalPrice;
    }

    public int getTotalQuantity() {
        int totalItems = 0;

        for (ItemToOrder items : this.itemstoOrder) {
            totalItems += items.getnumberOfItem();

        }
        return totalItems;

    }

    @Override
    public String toString() {
        return "[items:" + itemstoOrder + "]";
    }

}