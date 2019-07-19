package com.stackroute.Challenge3;

public class Cruze extends Car {
    Cruze(int noOfWheels, boolean stateOfEngine) {
        super(noOfWheels, stateOfEngine);
    }

    @Override
    public void brake() {
        System.out.println("Cruze:");
        super.brake();
    }
}