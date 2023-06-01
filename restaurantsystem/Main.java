package restaurantsystem;

public class Main {

    public static void main(String[] args) {

        Customer arun = new Customer("Arun", 20, "Male", "9087656545");
        Customer tina = new Customer("Tina", 21, "Female", "7847676783");

        Menu wiltonMenu = new Menu();

        Quantities half = Quantities.HALF;

        FoodItem chickenBiriyani = new FoodItem("chicken Biriyani", 100, half.getMeasure(), true);
        wiltonMenu.addItems(chickenBiriyani);
        FoodItem friedRice = new FoodItem("Veg fried rice", 150, Quantities.FULL.getMeasure(), false);
        wiltonMenu.addItems(friedRice);
        FoodItem noodles = new FoodItem("Chicken noodles", 200, Quantities.HALF.getMeasure(), true);
        wiltonMenu.addItems(noodles);
        FoodItem pasta = new FoodItem("Veg pasta", 300, Quantities.FULL.getMeasure(), false);
        wiltonMenu.addItems(pasta);

        Restaurant wilton = new Restaurant("Wilton", wiltonMenu);

        System.out.println(wilton.getMenu());

        arun.getBag().addToCart(wilton, noodles, 2);
        arun.getBag().addToCart(wilton, chickenBiriyani, 2);
        System.out.println("Cart of arun: " + arun.getBag());

        arun.orderFood(wilton);

        System.out.println("Arun's order: " + arun.orders);
        wilton.deliverOrderBy(arun);
        System.out.println();

        tina.getBag().addToCart(wilton, noodles, 2);

        tina.orderFood(wilton);
        System.out.println("Tina's orders: " + tina.orders);

        System.out.println("Orders in Restaurant: " + wilton.orderDetails);

    }
}