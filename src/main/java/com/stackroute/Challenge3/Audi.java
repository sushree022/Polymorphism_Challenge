package com.stackroute.Challenge3;
//SubClass 1
public class Audi extends Car{

//    Method to get basic characteristics
    public void audiCharacter()
    {
        System.out.println("******   AUDI  ******");
        System.out.println("Number of wheels="+ getWheels());
        cylinder("Audi-Cylinder",2);
    }
    //OverRiding method to start engine
    @Override
    public void startEngine() {
        System.out.println("The status of Audi's Engine is:"+ isEngine());
        System.out.println("Audi:");
        super.startEngine();
    }
    //OverRiding method to accelerate car
    @Override
    public void accelerate() {
        System.out.println("Audi accelerates and Its: ");
        super.accelerate();
    }
    }

