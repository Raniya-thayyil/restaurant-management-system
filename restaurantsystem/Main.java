package restaurantsystem;

public class Main {
    
    public static void main(String[] args) {        
        
        Customer arun = new Customer("Arun", 20, "Male");
        Bag arunsBag = new Bag(arun);
        Customer tina = new Customer("Tina", 21, "Female");

        Menu wiltonMenu = new Menu();

        FoodItem chickenBiriyani = new FoodItem("chicken Biriyani", 100, 0.5, "non veg");
        wiltonMenu.addItems(chickenBiriyani);
        FoodItem friedRice = new FoodItem("Veg fried rice", 150, 1, "veg");       
        wiltonMenu.addItems(friedRice);
        

        Restaurant wilton = new Restaurant("Wilton", wiltonMenu);

        arun.AddItems(arunsBag, wilton, friedRice, 2);
        arun.AddItems(arunsBag, wilton, chickenBiriyani, 1);

       arun.orderFood(arunsBag);
       
       System.out.println(arun.Orders);



    }
}
