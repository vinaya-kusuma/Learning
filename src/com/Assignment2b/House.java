package com.Assignment2b;

public class House {

    private String address;
    private double squareFootage;
    private double numRooms;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        if (squareFootage < 0){
            System.out.println("squareFootage must be a positive value");
        }
        else{
            this.squareFootage = squareFootage;
        }

    }

    public double getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(double numRooms) {
        if(numRooms < 0) {
            System.out.println("numRooms must be a positive value");
        }
        else {
            this.numRooms = numRooms;
        }


    }



}
