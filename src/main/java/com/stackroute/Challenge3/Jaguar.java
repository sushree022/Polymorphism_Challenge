package com.stackroute.Challenge3;
//SubClass 3
class Jaguar extends Car {

//     Method to get basic characteristics
    public void jaguarCharacter()
    {
        System.out.println("******   JAGUAR  ******");
        System.out.println("Number of wheels="+ getWheels());
//        name and no of cylinder are set
        cylinder("Jaguar-Cylinder",5);
    }
//      OverRiding method to start engine
    @Override
    public void startEngine() {
        System.out.println("The status of Jaguar's Engine is:"+ isEngine());
        System.out.println("Jaguar:");
        super.startEngine();
    }
//    OverRiding method to accelerate the car
    @Override
    public void accelerate() {
        System.out.println("Jaguar acceleartes and its: ");
        super.accelerate();
    }

}