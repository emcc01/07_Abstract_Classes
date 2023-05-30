package com.cc.java;

public class Circle extends Shape {

    //double, damit man auch Nachkommastellen sieht

    private double radius;

    //Konstruktor nutzen:
    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        // Hochfunktion und pi beide aus Math
        return Math.PI * Math.pow(radius, 2);
    }
 
    



    
}
