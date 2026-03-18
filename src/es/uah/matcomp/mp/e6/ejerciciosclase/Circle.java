package es.uah.matcomp.mp.e6.ejerciciosclase;
// Clase que hereda de Shape
public class Circle extends Shape{
    // Atributo propio
    private double radius=1.0;

    // Constructor por defecto
    public Circle(){
        radius=1.0;
    }

    // Constructor con radio
    public Circle(double radius){
        this.radius=radius;
    }

    // Constructor completo
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.filled=filled;
    }

    // Getter del radio
    public double getRadius(){
        return radius;
    }


    // Setter del radio
    public void setRadius(double radius){
        this.radius=radius;
    }

    // Implementación del área
    @Override
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    //Implementación del perímetro
    @Override
    public double getPerimeter(){
        return Math.PI*2*getRadius();
    }

    // toString usando el de la superclase
    public String toString(){
        return "Circle["+super.toString();
    }


}
