package es.uah.matcomp.mp.e4.ejerciciosclase;

public class Cylinder {
    private Circle base;
    private double height;

    // Base circle, an instance of Circle class
// Constructor with default color, radius and height
    public Cylinder() {
        base = new Circle(); // Call the constructor to construct the Circle
        height = 1.0;

    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        base= new Circle();
        base.setRadius(radius);  // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }


    public double getArea(){
        return 2*Math.PI*base.getRadius()*getHeight()+2*base.getArea();
    }


    // A public method for computing the volume of cylinder
    //  use superclass method getArea() to get the base area
    public double getVolume() {
        return base.getArea()*getHeight();
    }


    public String toString() {      // in Cylinder class
        return "Cylinder: base of Cylinder is:  " + base.toString()
                + " height=" + getHeight();
    }
}
