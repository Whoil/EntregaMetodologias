package es.uah.matcomp.mp.e1.ejerciciosclases;

// Clase que representa un círculo usando su radio
public class Circle2 {
    private double radius;  // Radio del círculo

    // Constructor por defecto: radio = 1.0
    public Circle2(){
        radius= 1.0;
    }

    // Constructor que permite inicializar el radio
    public Circle2(double radius){
        this.radius= radius;
    }

    // Devuelve el radio
    public double getRadius(){
        return radius;
    }

    // Modifica el radio, pero solo si es positivo
    public void setRadius(double newRadius){
        if (newRadius < 0) {
            System.out.println("ERROR, el radio debe ser positivo"); // aviso si no es válido
        }
        else {
            radius = newRadius; // solo se cambia si es correcto
        }
    }

    // Calcula el área del círculo (πr²)
    public double getArea(){
        return radius * radius * Math.PI;
    }

    // Calcula la circunferencia (2πr)
    public double getCircumference(){
        return 2 * radius * Math.PI;
    }

    // Devuelve la información del círculo en formato texto
    public String toString(){
        return "Circle [radius=" + radius + "]";
    }
}
