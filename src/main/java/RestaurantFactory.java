public class RestaurantFactory {

    //use getShape method to get object of type shape
    public static Restaurant getRestaurant(String res){
        if(res== null){
            return null;
        }
        if(res.equalsIgnoreCase("KFC")){
            return new KFC();

        } else if(res.equalsIgnoreCase("Burger King")){
            return new BurgerKing();

        } else if(res.equalsIgnoreCase("Taco Bell")){
            return new Tacobell();
        }

        return null;
    }
}
