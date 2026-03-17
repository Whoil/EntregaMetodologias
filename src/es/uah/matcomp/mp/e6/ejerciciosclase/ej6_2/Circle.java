package es.uah.matcomp.mp.e6.ejerciciosclase.ej6_2;

public class Circle implements GeometricObject {
    private double radius; // radio del círculo

    // Crea un círculo con el radio dado
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString(){
        // Representación en texto del círculo
        return "Circle[radius=" + radius + "]";
    }

    @Override
    public double getArea() {
        // Calcula el área a partir del radio
        return Math.PI * Math.sqrt(radius);
    }

    @Override
    public double getPerimeter() {
        // Calcula el perímetro del círculo
        return 2 * Math.PI * radius;
    }
}
