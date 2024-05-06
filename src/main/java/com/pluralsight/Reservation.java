package com.pluralsight;



public class Reservation {
   private String roomType;
   private double price;
   private int numberOfNight;
   private boolean isWeekend;
   private double reservationTotal;

    public Reservation(String roomType, double price, int numberOfNight, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNight = numberOfNight;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    private double roomTotal( String roomType, int numberOfNight){
        double perNightPrice ;

            if(roomType.equalsIgnoreCase("king")){
                perNightPrice = 139.00;}

            else if  (roomType.equalsIgnoreCase("double")) {
                perNightPrice = 124.00;
            }
            return perNightPrice * numberOfNight ;
    }
}