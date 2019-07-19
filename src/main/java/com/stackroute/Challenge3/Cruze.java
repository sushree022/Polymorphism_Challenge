package com.stackroute.Challenge3;
//SubClass 2
public class Cruze extends Car {

//    Method to get basic characteristics
    public void cruzeCharacter()
    {
        System.out.println("******   CRUZE  ******");
        System.out.println("No of wheels="+ getWheels());
//        name and no of cylinder are set
        cylinder("Cruze-Cylinder",3);
    }
//  OverRiding method to start engine
    @Override
    public void startEngine() {
        System.out.println("The status of Cruze's engine is:"+ isEngine());
        System.out.println("Cruze: ");
        super.startEngine();
    }
//    OverRiding method to stop car
    @Override
    public void brake() {
        System.out.println("Cruze applies break and it: ");
        super.brake();
    }
}