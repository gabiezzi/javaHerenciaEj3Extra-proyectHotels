
package service;

import entity.FourStarHotelEntity;

public interface FourStarHotelService {
    
    public FourStarHotelEntity createNewFourStarsHotel();
    public double calculateRoomPrice();
    public double addedValueGym();
    public double addedValueRestaurant();
}
