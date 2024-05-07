package com.pluralsight;

public class Room {
    private int numberOfBeds ;
    private double price;
    private String occupied;
    private boolean dirtyRoom;
    private int availableRoom;
    private int roomNumber;
    private String roomType;

    public Room( int numberOfBeds, double price, String occupied, int dirtyRoom, int availableRoom) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirtyRoom = dirtyRoom;
        this.availableRoom = availableRoom;
        this.roomNumber = roomNumber;



    }

    public Room(int numberOfBeds, String price, String occupied, String available, String roomType)   {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public String getOccupied() {
        return occupied;
    }

    public boolean  getDirtyRoom() {
        return dirtyRoom;
    }

    public int getAvailableRoom() {
        return availableRoom;
    }

    // create method to check in / check out/ clean room or dirty room
    public void checkIN() {
        if(this.occupied.equals("available")) {
            this.occupied = "occupied";
            System.out.println("Check in to room " + this.roomNumber );
        }else {
            System.out.println("Room is not Available ");
        }
    // method to checking out
    }
    public void checkOut(){
        if (this.occupied.equals("occupied")){
            this.occupied = "available ";
            System.out.println("Checked out of room " + this.roomNumber);
        }else{
            System.out.println(" No Check out ");
        }
        }
    public void cleanRoom() {
        if (this.occupied.equals("dirty")){
            this.occupied = "available";
            System.out.println("Room" + this.roomNumber + "cleaned");
        }else {
            System.out.println(" Room is clean");
        }


    }
    }


