package restaurantsystem;

import java.util.ArrayList;

public class Order {

    private Customer customer;
    private String status;

    ArrayList<ItemToOrder> orderItems = new ArrayList<>();

    public Order(Customer customer) {
        this.customer = customer;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order [ Customer=" + this.getCustomer() + ", numberOfItems=" + this.getTotalQuantity() + ", totalPrice="
                + this.getTotalprice() + ", status=" + status
                + ", orderItems=" + orderItems + "]";
    }

}
