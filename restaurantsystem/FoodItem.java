package restaurantsystem;

enum Quantities {

    FULL("Full"),
    HALF("Half"),
    QUARTER("Quarter");

    private String measure;

    private Quantities(String measure) {
        this.measure = measure;

    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

}

public class FoodItem {

    private String name;
    private double price;
    private String quantity;
    // private enum quantities {FULL, HALF, QUARTER}
    // private quantities aQuantities;
    Quantities quantity1;

    private boolean isNonVeg;

    public FoodItem(String name, double price, String quantity, boolean isNonVeg) {
        this.name = name;
        this.price = price;
        // this.aQuantities = aQuantities;
        this.quantity = quantity;
        this.isNonVeg = isNonVeg;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public boolean isNonVeg() {
        return isNonVeg;
    }

    public void setNonVeg(boolean isNonVeg) {
        this.isNonVeg = isNonVeg;
    }

    @Override
    public String toString() {
        return "FoodItem [name=" + name + ", price=" + price + ", quantity=" + quantity + ", isNonVeg=" + isNonVeg
                + "]";
    }

}