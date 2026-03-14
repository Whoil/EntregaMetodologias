package es.uah.matcomp.mp.e4.ejerciciosclase;

public class Circle {
    // Save as "es.uah.matcomp.mp.e1.ejerciciosclases.Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius=1;
    private String color="red";

    public Circle() {  // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }



    public Circle(double r) {  // 2nd constructor
        this.radius = r;
    }

    public Circle (double r, String c){
        this.radius=r;
        this.color=c;

    }

    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String getColor(){
        return color;
    }
    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }


    public void setColor(String newColor) {
        this.color=newColor;

    }

    public String toString() {
        return "[radius=" + radius + " color=" + color + "]";
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

