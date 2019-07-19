package com.stackroute.Challenge3;

class Car {
//    Declaration of variables
 private int wheels=4, noOfCylinder;
 private boolean engine= true;
 private String cylinderName;

//getters for wheels and engine
    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

//     logic for constructor
public void cylinder(String name, int number) {
    this.cylinderName= name;
    this.noOfCylinder= number;

}
//      getters and setters

    public int getNoOfCylinder() {
        return noOfCylinder;
    }

    public void setNoOfCylinder(int noOfCylinder) {
        this.noOfCylinder = noOfCylinder;
    }

    public String getCylinderName() {
        return cylinderName;
    }

    public void setCylinderName(String cylinderName) {
        this.cylinderName = cylinderName;
    }

//      methods
    public void startEngine()
    {
        System.out.println("starts");
    }
    public void accelerate()
    {
        System.out.println("Speed increases");
    }
    public void brake()
    {
        System.out.println("stops");
    }


}
