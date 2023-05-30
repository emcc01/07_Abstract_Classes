package com.cc.java;

public class Rectangle extends Shape{


    //wenn man von abstracter Klasse erbt und die enthält abstrakte Methode, muss man diese implementieren, mit source action:
   
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    

       
    }

    
    

