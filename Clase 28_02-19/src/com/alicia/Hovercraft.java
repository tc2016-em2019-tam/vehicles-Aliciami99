package com.alicia;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    private int numWheels;
    private double displacement;

    public Hovercraft(String name, int maxPassenger, double maxSpeed, int numWheels, double displacement) {
        super(name, maxPassenger, maxSpeed);
        this.numWheels = numWheels;
        this.displacement = displacement;
    }
    public Hovercraft(String name, int numWheels, double displacement) {
        super(name);
        this.numWheels = numWheels;
        this.displacement = displacement;}

    @Override
    public int getNumWheels(int numWheels) {
        return 0;
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

    @Override
    public double getDisplacement() {
        return 0;
    }

    @Override
    public void setDisplacement(double displacement) {

    }

    @Override
    public void launch() {

    }

    public void enterLand(){
    }
    public void enterSea(){

    }
}

