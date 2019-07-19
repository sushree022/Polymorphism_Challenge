package com.stackroute.Challenge3;

class Car {
private int wheels=4, noOfCylinder;
private boolean engine= true;
private String cylinderName;
Car(int noOfWheels, boolean stateOfEngine)
{
    wheels=noOfWheels;
    engine= stateOfEngine;
}

// logic for constructor
public void cylinder(String name, int number) {
    this.cylinderName= name;
    this.noOfCylinder= number;

}
//getter and setter

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

// methods
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
