package com.companye;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Olympian", 8,12);
//        theatre.getSeats();
        if(theatre.reserveSeat("H11")){
            System.out.println("please pay");
        }else{
            System.out.println("Sorry seat is not available");
        }

        if(theatre.reserveSeat("H11")){
            System.out.println("please pay");
        }else{
            System.out.println("Sorry seat is not available");
        }
	// write your code here


    }
}
