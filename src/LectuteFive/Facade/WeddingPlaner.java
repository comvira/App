package LectuteFive.Facade;

public class WeddingPlaner {
    private Hall hall;
    private Restaurant restaurant;
    private Photographer photographer;

    public WeddingPlaner() {
        this.hall = new Hall();
        this.restaurant = new Restaurant();
        this.photographer = new Photographer();
    }

    public void organize() {
        hall.book();
        restaurant.orderFood();
        photographer.book();
    }
}
