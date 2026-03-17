package es.uah.matcomp.mp.e3.ejerciciosclase;

// Clase Rectangle que hereda de Shape
public class Rectangle extends Shape{
    private double length; // largo
    private double width;  // ancho

    // Constructor por defecto (1x1)
    public Rectangle(){
        super();        // llama al constructor de Shape
        length= 1.0;
        width= 1.0;
    }

    // Constructor que recibe ancho y largo
    public Rectangle(double width,double length){
        super();        // usa valores por defecto de Shape
        this.width= width;
        this.length=length;
    }

    // Constructor completo (ancho, largo, color y relleno)
    public Rectangle(double width,double length,String color, boolean filled){
        super(color, filled); // inicializa la parte de Shape
        this.width= width;
        this.length=length;
    }

    // Devuelve el largo
    public double getLength(){
        return length;
    }

    // Modifica el largo
    public void setLength(double length){
        this.length=length;
    }

    // Devuelve el ancho
    public double getWidth(){
        return width;
    }

    // Modifica el ancho
    public void setWidth(double width){
        this.width=width;
    }

    // Calcula el área
    public double getArea(){
        return length * width;
    }

    // Calcula el perímetro
    public double getPerimeter(){
        return (length * 2) + (2 * width);
    }

    // Devuelve la información del rectángulo incluyendo la parte de Shape
    @Override
    public String toString(){
        return "Rectangle["+ super.toString()+ ",length=" + length + " ,width=" + width + "]";
    }
}
