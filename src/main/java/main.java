public class main {
    public static void main(String[] args) {
        Restaurant res1 = RestaurantFactory.getRestaurant("KFC");
        res1.menu();

        Restaurant res2 = RestaurantFactory.getRestaurant("Taco Bell");
        res2.menu();

        Restaurant res3 = RestaurantFactory.getRestaurant("Burger King");
        res3.menu();

    }
}
