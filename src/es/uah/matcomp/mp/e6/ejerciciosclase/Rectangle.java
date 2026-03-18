package es.uah.matcomp.mp.e6.ejerciciosclase;

import java.util.zip.Adler32;

// Clase que hereda de Shape
public class Rectangle extends Shape {
    // Atributos propios
    private double width = 1.0;
    private double length = 1.0;

    // Constructor por defecto
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor con dimensiones
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Constructor completo
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter y setter de width
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Getter y setter de length
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    // Área del rectángulo
    @Override
    public double getArea() {
        return width * length;
    }

    // Perímetro del rectángulo
    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    // toString incluyendo datos de Shape
    public String toString() {
        return "Rectangle [" + super.toString() + ", width= " + width + ", length= " + length + "]";
    }
}
