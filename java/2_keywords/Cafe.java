public class Cafe {
    public static int totalItemsSold = 0; // static

    public static void main(String[] args) {
        RestaurantMenuItem croissant = new Pastry("Croissant", "Butter"); // 'new'
        croissant.display();
        totalItemsSold++;
        System.out.println("Total sold: " + Cafe.totalItemsSold);
    }
}
