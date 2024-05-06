package com.pluralsight;

public class Room {
    private int numberOfBeds ;
    private double price;
    private int occupied;
    private int dirtyRoom;
    private int availableRoom;

    public Room(int numberOfBeds, double price, int occupied, int dirtyRoom, int availableRoom) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirtyRoom = dirtyRoom;
        this.availableRoom = availableRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public int getOccupied() {
        return occupied;
    }

    public int getDirtyRoom() {
        return dirtyRoom;
    }

    public int getAvailableRoom() {
        return availableRoom;
    }
}

