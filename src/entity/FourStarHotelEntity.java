package entity;

public class FourStarHotelEntity extends HotelEntity {

    protected boolean gym; // A true - B False
    protected String restaurantName;
    protected int restaurantCapacity;

    public FourStarHotelEntity() {
         this.gym = gym = true;
    }

    public FourStarHotelEntity(boolean gym, String restaurantName, int restaurantCapacity, int roomNumber, int bedsNumber, int floorNumbers,  String lodgingName, String lodgingAdress, String lodgingCity, String lodgingManager) {
        super(roomNumber, bedsNumber, floorNumbers, lodgingName, lodgingAdress, lodgingCity, lodgingManager);
        this.gym = gym = true; // default true -> gym type A
        this.restaurantName = restaurantName;
        this.restaurantCapacity = restaurantCapacity;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getRestaurantCapacity() {
        return restaurantCapacity;
    }

    public void setRestaurantCapacity(int restaurantCapacity) {
        this.restaurantCapacity = restaurantCapacity;
    }

    @Override
    public String toString() {
        return super.toString() +"\nFourStarHotelEntity{" + "gym=" + gym + ", restaurantName=" + restaurantName + ", restaurantCapacity=" + restaurantCapacity + '}';
    }
    
    

}
