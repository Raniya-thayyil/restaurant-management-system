package restaurantsystem;

public class FoodItem {

    private String name;
    private double price;
    private double quantity;
    private String category;

    public FoodItem(String name, double price, double quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FoodItem [name=" + name + ", price=" + price + ", quantity=" + quantity + ", category=" + category
                + "]";
    }   

    
}
