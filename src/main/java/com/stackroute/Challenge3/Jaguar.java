package com.stackroute.Challenge3;

class Jaguar extends Car {
    Jaguar(int noOfWheels, boolean stateOfEngine) {
        super(noOfWheels, stateOfEngine);
    }

    @Override
    public void accelerate() {
        System.out.println("Jaguar:");
        super.accelerate();
    }

}