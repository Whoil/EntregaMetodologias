package es.uah.matcomp.mp.e3.ejerciciosclase;

// Clase que representa un círculo
public class Circle3 {

    // Atributos: radio y color
    private double radius=1.0;
    private String color="red";

    // Constructor por defecto
    public Circle3(){
        color="red";
        radius=1.0;
    }

    // Constructor con radio
    public Circle3(double radius){
        color="red";
        this.radius=radius;     // asigna el radio recibido

    }

    // Constructor con radio y color
    public Circle3(double radius, String color){
        this.color=color;
        this.radius=radius;
    }

    // Getter del radio
    public double getRadius() {
        return radius;
    }

    // Setter del radio

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calcula el área del círculo
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    // Getter del color
    public String getColor(){
        return color;
    }

    // Setter del color
    public void setColor(String color){
        this.color=color;
    }

    // Representación en texto del objeto

    public String toString(){
        return "Circle[ color=" +color+ ",radius=" + radius + "]";
    }
}
