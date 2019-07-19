package com.stackroute.Challenge3;

public class Driver
{
    public static void main(String args[])
    {
        Audi audi= new Audi(4,true);
        audi.startEngine();
        audi.accelerate();
        audi.brake();
        Cruze cruze=new Cruze(4,true);
        cruze.brake();
        Jaguar jaguar=new Jaguar(4,true);
        jaguar.accelerate();
    }
}