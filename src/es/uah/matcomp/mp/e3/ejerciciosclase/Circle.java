package es.uah.matcomp.mp.e3.ejerciciosclase;

// Clase Circle que hereda de Shape
public class Circle extends Shape{
    private double radius; // radio del círculo

    // Constructor por defecto
    public Circle(){
        super();       // llama al constructor por defecto de Shape
        radius=1.0;    // inicializa el radio a 1.0
    }

    // Constructor que recibe el radio
    public Circle(double radius){
        super();           // usa los valores por defecto de Shape
        this.radius=radius;
    }

    // Constructor completo (radio, color y relleno)
    public Circle(double radius, String color, boolean filled){
        super(color,filled); // inicializa los atributos heredados
        this.radius=radius;
    }

    // Devuelve el radio
    public double getRadius() {
        return radius;
    }

    // Modifica el radio
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calcula el área del círculo
    public double getArea(){
        return Math.PI*Math.sqrt(radius);
    }

    // Calcula el perímetro
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    // Devuelve la información del círculo incluyendo la parte de Shape
    @Override
    public String toString(){
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}
