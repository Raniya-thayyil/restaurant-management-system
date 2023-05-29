package restaurantsystem;

public class ItemToOrder {

    FoodItem item;
    Customer customer;
    int numberOfItem;

    public ItemToOrder(Customer customer, FoodItem item, int numberOfItem) {
        this.item = item;
        this.numberOfItem = numberOfItem;
        this.customer = customer;
    }

    public FoodItem getItem() {
        return item;
    }

    public void setItem(FoodItem item) {
        this.item = item;
    }

    public int getnumberOfItem() {
        return numberOfItem;
    }

    public void setnumberOfItem(int numberOfItem) {
        this.numberOfItem = numberOfItem;
    }

    @Override
    public String toString() {
        return "ItemToOrder [item=" + item + ", numberOfItem=" + numberOfItem + "]";
    }  
}
