package es.uah.matcomp.mp.e6.ejerciciosclase;

// Clase abstracta base
public abstract class Shape {

    // Atributos protegidos (accesibles por subclases)
    protected String color = "red";
    protected boolean filled = true;


    // Constructor por defecto
    public Shape() {
        this.color ="red";
        this.filled =true;
    }

    // Constructor con parámetros
    public Shape(String color, boolean filled) {
        this.color =color;
        this.filled =filled;
    }

    // Getter de filled
    public String getColor() {
        return color;
    }

    // Setter del color
    public void setColor(String color) {
        this.color =color;
    }

    // Getter de filled
    public boolean isFilled() {
        return filled;
    }

    // Setter de filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Métodos abstractos → obligan a las subclases a implementarlos
    public abstract double getArea();

    public abstract double getPerimeter();

    // toString común para todas las figuras

    public String toString() {
        return "Shape [color=" + color + ", filler=" + filled + "]";
    }

}
