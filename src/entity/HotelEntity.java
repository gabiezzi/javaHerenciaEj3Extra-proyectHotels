/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Anita
 */
public abstract class HotelEntity extends LodgingEntity {

    protected int roomNumber;
    protected int bedsNumber;
    protected int floorNumbers;
    protected double roomPrice;

    public HotelEntity() {
        this.roomPrice = roomPrice = 50d;
    }

    public HotelEntity(int roomNumber, int bedsNumber, int floorNumbers, String lodgingName, String lodgingAdress, String lodgingCity, String lodgingManager) {
        super(lodgingName, lodgingAdress, lodgingCity, lodgingManager);
        this.roomNumber = roomNumber;
        this.bedsNumber = bedsNumber;
        this.floorNumbers = floorNumbers;
        this.roomPrice = roomPrice = 50d;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedsNumber() {
        return bedsNumber;
    }

    public void setBedsNumber(int bedsNumber) {
        this.bedsNumber = bedsNumber;
    }

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHotelEntity{" + "roomNumber=" + roomNumber + ", bedsNumber=" + bedsNumber + ", floorNumbers=" + floorNumbers + ", roomPrice=" + roomPrice + '}';
    }

}
