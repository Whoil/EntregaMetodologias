package es.uah.matcomp.mp.e6.ejerciciosclase;

public class Circle extends Shape{
    private double radius=1.0;
    public Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    public String toString(){
        return "Circle["+super.toString();
    }

}
