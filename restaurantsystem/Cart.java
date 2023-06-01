package restaurantsystem;

public class Cart extends BaseCart {

    public Cart(Customer customer) {
        this.customer = customer;
    }

    public boolean addToCart(Restaurant restaurant, FoodItem food, int numberOfItems) {
        ItemToOrder itemToOrder = new ItemToOrder(food, numberOfItems);
        if (!restaurant.getMenu().menu.contains(food)) {
            return false;
        }
        super.orderItems.add(itemToOrder);
        return true;
    }

    @Override
    public String toString() {
        return "Cart [customer=" + customer + ", foodItems=" + this.orderItems + "]";
    }

}