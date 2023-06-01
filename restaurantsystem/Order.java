package restaurantsystem;

enum OrderStatus {
    ORDER_PLACED,
    ORDER_DELIVERED
}

public class Order extends BaseCart {
    private OrderStatus status;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [ Customer=" + this.getCustomer() + ", numberOfItems=" + this.getTotalQuantity() + ", totalPrice="
                + this.getTotalprice() + ", status=" + status
                + ", orderItems=" + orderItems + "]";
    }
}