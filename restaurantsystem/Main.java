package restaurantsystem;

public class Main {

    public static void main(String[] args) {

        Customer arun = new Customer("Arun", 20, "Male", "9087656545");
        Bag arunsBag = new Bag(arun);
        Customer tina = new Customer("Tina", 21, "Female", "7847676783");
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

        ItemToOrder chickenNoodles = new ItemToOrder(arun, noodles, 2);
        arun.AddItems(arunsBag, wilton, chickenNoodles);
        ItemToOrder vegPasta = new ItemToOrder(arun, pasta, 1);
        arun.AddItems(arunsBag, wilton, vegPasta);        
        ItemToOrder cb = new ItemToOrder(tina, chickenBiriyani, 2);
        tina.AddItems(tinasBag, wilton, cb);


        arun.orderFood(wilton, arunsBag);
        // tina.AddItems(tinasBag, wilton, pasta, 2);
        tina.orderFood(wilton, tinasBag);

        System.out.println("tina's order: " + tina.Orders);
        System.out.println("orders in restaurant:" + wilton.orders);

        wilton.deliverOrderBy(arun);
        System.out.println("Arun's order: " + arun.Orders);      



    }
}