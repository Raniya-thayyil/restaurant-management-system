package restaurantsystem;

enum OrderStatus {
    ORDER_PLACED("order placed"),
    ORDER_DELIVERED("order delivered");

    private String orderStatus;

    OrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

}

public class Order extends BaseCart {
    private String status;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [ Customer=" + this.getCustomer() + ", numberOfItems=" + this.getTotalQuantity() + ", totalPrice="
                + this.getTotalprice() + ", status=" + status
                + ", orderItems=" + orderItems + "]";
    }
}