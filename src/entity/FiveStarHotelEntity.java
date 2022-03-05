package entity;

public final class FiveStarHotelEntity extends FourStarHotelEntity {

    private int conferenceRoomQuant;
    private int suitesRoomQuant;
    private int limousineNumber;

    public FiveStarHotelEntity() {
    }

    public FiveStarHotelEntity(int conferenceRoomQuant, int suitesRoomQuant, int limousineNumber, boolean gym, String restaurantName, int restaurantCapacity, int roomNumber, int bedsNumber, int floorNumbers, double roomPrice, String lodgingName, String lodgingAdress, String lodgingCity, String lodgingManager) {
        super(gym, restaurantName, restaurantCapacity, roomNumber, bedsNumber, floorNumbers, lodgingName, lodgingAdress, lodgingCity, lodgingManager);
        this.conferenceRoomQuant = conferenceRoomQuant;
        this.suitesRoomQuant = suitesRoomQuant;
        this.limousineNumber = limousineNumber;
    }

    public int getConferenceRoomQuant() {
        return conferenceRoomQuant;
    }

    public void setConferenceRoomQuant(int conferenceRoomQuant) {
        this.conferenceRoomQuant = conferenceRoomQuant;
    }

    public int getSuitesRoomQuant() {
        return suitesRoomQuant;
    }

    public void setSuitesRoomQuant(int suitesRoomQuant) {
        this.suitesRoomQuant = suitesRoomQuant;
    }

    public int getLimousineNumber() {
        return limousineNumber;
    }

    public void setLimousineNumber(int limousineNumber) {
        this.limousineNumber = limousineNumber;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFiveStarHotelEntity{" + "conferenceRoomQuant=" + conferenceRoomQuant + ", suitesRoomQuant=" + suitesRoomQuant + ", limousineNumber=" + limousineNumber + '}';
    }

    
    
    
}
