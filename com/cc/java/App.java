package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Rectangle rectangle = new Rectangle(10.0, 10.0);
        Triangle triangle = new Triangle(10.0, 10.0);
        Circle circle = new Circle(5.0);

        output("------ Flächen ------");
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Dreieck: " + triangle.area());
        output("Fläche Kreis: " + circle.area());


        output("------  Differenzen ------");
        output("Diff. r-t: " + areaDiff(rectangle, triangle));
        output("Diff. r-c: " + areaDiff(rectangle, circle));

            
            }

  

    private static double areaDiff(Rectangle r, Triangle t) {
        return r.area() - t.area();
    }
// hier normale Druckfunktion, habe ich gelöscht aus Versehen:
    private static void output(String outputStr){


    }



}

