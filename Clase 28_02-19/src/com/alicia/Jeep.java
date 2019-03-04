package com.alicia;

public class Jeep extends Vehicle implements LandVehicle{
    private int numWheels;

    public Jeep(String name, int maxPassenger, double maxSpeed, int numWheels) {
        super(name, maxPassenger, maxSpeed);
        this.numWheels = numWheels;
    }



    public Jeep(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }



    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void setNumWheels(int numWheels) {

    }

    @Override
    public void drive() {

    }

    public  void soundHorn(){
        System.out.println("Meep,meep!");
    }

    @Override
    public int getNumWheels(int numWheels) {
        return 0;
    }
}
