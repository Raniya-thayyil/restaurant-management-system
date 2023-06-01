package restaurantsystem;

public class ItemToOrder {

    FoodItem item;  
    int numberOfItem;

    public ItemToOrder(FoodItem item, int numberOfItem) {
        this.item = item;
        this.numberOfItem = numberOfItem;        
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
