package es.uah.matcomp.mp.e6.ejerciciosclase.ej6_2;

// Clase Rectangle que implementa la interfaz GeometricObject
public class Rectangle implements GeometricObject{
    private double width;  // ancho del rectángulo
    private double length; // largo del rectángulo

    // Constructor que inicializa ancho y largo
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    // Devuelve la información del rectángulo en formato texto
    public String toString() {
        return "Rectangle[width="+ width + ",length=" + length + "]";
    }

    // Calcula el área del rectángulo (ancho * largo)
    @Override
    public double getArea(){
        return width * length;
    }

    // Calcula el perímetro (2*largo + 2*ancho)
    @Override
    public double getPerimeter(){
        return (length * 2) + (2 * width);
    }
}
