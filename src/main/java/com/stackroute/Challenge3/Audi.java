package com.stackroute.Challenge3;

public class Audi extends Car{
    Audi(int noOfWheels, boolean stateOfEngine) {
        super(noOfWheels, stateOfEngine);
    }

    @Override
    public void startEngine() {
        System.out.println("Audi:");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("Audi:");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.println("Audi:");
        super.brake();
    }

}
