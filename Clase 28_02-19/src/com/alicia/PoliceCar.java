package com.alicia;

public class PoliceCar extends Vehicle implements IEmergency, LandVehicle {
    private int numWheels;

    public PoliceCar(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    public PoliceCar(String name, int numWheels){
        super(name);
        this.numWheels = numWheels;

    }

    @Override
    public void soundSiren(){
        System.out.println("Calling soundSiren method");
    }

    @Override
    public int getNumWheels(int numWheels){
        return numWheels;
    }

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override

    public void setNumWheels(int numWheels){
        this.numWheels = numWheels;
    }

    @Override
    public void drive(){
        System.out.println("Calling drive method");
    }

    public void patrol(){
        System.out.println("Police Car patrolling");
    }
}

