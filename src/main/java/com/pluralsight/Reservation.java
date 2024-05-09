package com.pluralsight;



public class Reservation {
   private String roomType;
   private int numberOfNight;
   private boolean weekend;


    public Reservation(String roomType, double price, int numberOfNight, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.numberOfNight = numberOfNight;
        this.weekend = weekend;

    }


    public boolean setWeekend(boolean weekend) {

        return this.weekend;
    }

    public int getNumberOfNight() {
        return this.numberOfNight;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public double getPrice() {
        double weekendFactor = (this.weekend) ? 1.10 : 1;
        // if weekend is select * by 1.10
        double perNightPrice;
        if(this.roomType.equalsIgnoreCase("king")){
            return  perNightPrice = 139.00 * weekendFactor;}

        else (this.roomType.equalsIgnoreCase("double")) {
            perNightPrice = 124.00 * weekendFactor;
        }

   public double getReservationTotal(){
        return this.numberOfNight * this.getPrice()
        }

    }


}