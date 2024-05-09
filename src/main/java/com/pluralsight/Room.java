package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean availableRoom;
    private int roomNumber;
    private String roomType;

    public Room( int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
        // this is default data // assuming room is clean which is why its false , when it true it mean room is dirty
    }


    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getNumberOfBeds() {

        return this.numberOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean getOccupied() {

        return this.occupied;
    }

    public boolean  getDirty() {

        return this.dirty;
    }

    public boolean isAvailableRoom() {
        // below show that as long as it's not occupied and is not dirty will be return available
        return (!this.occupied && !this.dirty);
    }

    // create method to check in / check out/ clean room or dirty room
    public void checkIN() {
            this.occupied = true;
            this.dirty = true ;
        if(this.occupied.equals("available")) {
            System.out.println("Check in to room " + this.roomNumber );
        }else {
            System.out.println("Room is not Available ");
        }
    // method to checking out
    }
    public void checkOut(){
        this.occupied = false;

        if (this.occupied.equals("occupied")){
            this.occupied = Boolean.parseBoolean("available ");
            System.out.println("Checked out of room " + this.roomNumber);
        }else{
            System.out.println(" No Check out ");
        }
        }
    public void cleanRoom() {
        if (this.occupied.equals("dirty")){
            this.occupied = Boolean.parseBoolean("available");
            System.out.println("Room" + this.roomNumber + "cleaned");
        }else {
            System.out.println(" Room is clean");
        }


    }
    }


