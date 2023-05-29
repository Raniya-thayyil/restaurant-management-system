package restaurantsystem;

public class Main {

    public static void main(String[] args) {

        Customer arun = new Customer("Arun", 20, "Male");
        Bag arunsBag = new Bag(arun);
        Customer tina = new Customer("Tina", 21, "Female");
        Bag tinasBag = new Bag(tina);

        Menu wiltonMenu = new Menu();

        FoodItem chickenBiriyani = new FoodItem("chicken Biriyani", 100, 0.5, "non veg");
        wiltonMenu.addItems(chickenBiriyani);
        FoodItem friedRice = new FoodItem("Veg fried rice", 150, 1, "veg");
        wiltonMenu.addItems(friedRice);
        FoodItem noodles = new FoodItem("Chicken noodles", 200, 0.5, "non veg");
        wiltonMenu.addItems(noodles);
        FoodItem pasta = new FoodItem("Veg pasta", 300, 1, "veg");
        wiltonMenu.addItems(pasta);

        Restaurant wilton = new Restaurant("Wilton", wiltonMenu);

        arun.AddItems(arunsBag, wilton, friedRice, 2);
        arun.AddItems(arunsBag, wilton, chickenBiriyani, 1);
        arun.orderFood(wilton, arunsBag);
        tina.AddItems(tinasBag, wilton, noodles, 1);
        tina.AddItems(tinasBag, wilton, pasta, 2);
        tina.orderFood(wilton, tinasBag);

        System.out.println("Arun's order: " + arun.Orders);
        System.out.println("orders in restaurant:" + wilton.orders);

    }
}