package restaurantsystem;

import java.util.ArrayList;

public class Menu {
        
    ArrayList<FoodItem> menu = new ArrayList<>();

    public void addItems(FoodItem item) {
        menu.add(item);
    }

    public void getVegItems() {
        for (FoodItem food : this.menu) {
            if (!food.isNonVeg()) {
                System.out.println(food);
            }
        }
    }

    public void getNonVegItems() {
        for (FoodItem food : this.menu) {
            if (food.isNonVeg()) {
                System.out.println(food);
            }
        }
    }

    @Override
    public String toString() {
        return "Menu [menu=" + menu + "]";
    }   

}
