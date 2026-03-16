package es.uah.matcomp.mp.e3.ejerciciosclase;

public class Circle3 {
    private double radius=1.0;
    private String color="red";

    public Circle3(){
        color="red";
        radius=1.0;
    }

    public Circle3(double radius){
        color="red";
        this.radius=radius;
    }

    public Circle3(double radius, String color){
        this.color=color;
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.sqrt(radius);
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }

    public String toString(){
        return "Circle[ color=" +color+ ",radius=" + radius + "]";
    }
}
