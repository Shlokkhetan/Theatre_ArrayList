package com.companye;

import java.util.*;
import java.util.List;

public class Theatre {
    private String name;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int numRows, int seatsPerRow) {
        this.name = name;

        int lastRow = 'A' + (numRows-1);
        for(char row = 'A'; row<= lastRow; row++){
            for(int seatnum = 1; seatnum<=seatsPerRow; seatnum++){
                Seat seat = new Seat(row + String.format("%02d", seatnum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = null;
        for(Seat seat: seats){
            if(seat.getSeatNumber().equals(seatNumber)){
                requestedSeat = seat;
                break;
            }


        }
        if(requestedSeat == null){
            System.out.println("the seat was not found" + seatNumber);
        }
        return requestedSeat.reserve();
    }

    public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());

        }
    }

    private class Seat{
        private final String seatNumber;
        private boolean reserved = false;



        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }
        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat: " + seatNumber + " reserved");
                return true;
            }else{
                return false;
            }

        }
        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Seat : " + seatNumber + " cancelled");
                return true;
            }else{
                return false;
            }
        }


    }
}
