package com.stackroute.Challenge3;

//Executable codes
public class Driver
{
    public static void main(String args[])
    {
//        Instance of Audi class created
        Audi audi= new Audi();
//        Method of Audi class is called
        audi.audiCharacter();
//        getting the information about Audi
        System.out.println("Name of Cylinder of Audi=" + audi.getCylinderName());
        System.out.println("Number of cylinder=" + audi.getNoOfCylinder());
//        Methods of Car class are accessed through Audi class
        audi.startEngine();
        audi.accelerate();
//        Instance of Cruze class created
        Cruze cruze= new Cruze();
        cruze.cruzeCharacter();
//        getting the information about Cruze
        System.out.println("Name of Cylinder of Cruze=" + cruze.getCylinderName());
        System.out.println("Number of cylinder="+cruze.getNoOfCylinder());
//        Methods of Car class are accessed through Cruze class
        cruze.startEngine();
        cruze.brake();
//        Instance of Jaguar class created
        Jaguar jaguar= new Jaguar();
        jaguar.jaguarCharacter();
//        getting the information about Jaguar
        System.out.println("Name of Cylinder of Jaguar=" +jaguar.getCylinderName());
        System.out.println("Number of cylinder="+jaguar.getNoOfCylinder());
//        Methods of Car class are accessed through Jaguar class
        jaguar.startEngine();
        jaguar.accelerate();
    }
}