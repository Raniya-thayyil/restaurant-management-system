package restaurantsystem;

import java.util.ArrayList;

public class Menu {

    ArrayList<FoodItem> vegItems = new ArrayList<>();
    ArrayList<FoodItem> nonvegItems = new ArrayList<>();

    public void addItems(FoodItem item) {
        if (item.getCategory() == "veg") {
            this.vegItems.add(item);
        }
        else {
            this.nonvegItems.add(item);
        }

    }

    @Override
    public String toString() {
        return "Menu [vegItems=" + vegItems + ", nonvegItems=" + nonvegItems + "]";
    }

    

    
}
