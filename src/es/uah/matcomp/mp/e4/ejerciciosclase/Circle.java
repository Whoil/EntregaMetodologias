package es.uah.matcomp.mp.e4.ejerciciosclase;

public class Circle {
    // Save as "es.uah.matcomp.mp.e1.ejerciciosclases.Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius=1;
    private String color="red";

    // Constructor with radius
    public Circle() {  // 1st (default) constructor
        radius = 1.0;
        color = "red"; // initialize radius
    }



    public Circle(double r) {  // 2nd constructor
        this.radius = r;
    }

    public Circle (double r, String c){
        this.radius=r; // set radius
        this.color=c; // set color

    }


    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Method to compute the area of the circle
    public double getArea() {
        return radius*radius*Math.PI;
    }


    // Getter for color
    public String getColor(){
        return color;
    }

    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }


    // Setter for color
    public void setColor(String newColor) {
        this.color=newColor;

    }

    // Returns a string representation of the object
    public String toString() {
        return "[radius=" + radius + " color=" + color + "]";
    }


    // Method to compute the circumference (perimeter)
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

