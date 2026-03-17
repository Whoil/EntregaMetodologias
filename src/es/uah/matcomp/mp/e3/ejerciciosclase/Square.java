package es.uah.matcomp.mp.e3.ejerciciosclase;

// Clase Square que hereda de Rectangle
public class Square extends Rectangle{

    // Constructor por defecto
    public Square(){
        super(); // usa el constructor por defecto de Rectangle
    }

    // Constructor que recibe el lado
    public Square(double side){
        super(side,side); // largo y ancho iguales
    }

    // Constructor completo (lado, color y relleno)
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled); // inicializa todo con lados iguales
    }

    // Devuelve el lado (usa el ancho, ya que en un cuadrado son iguales)
    public double getSide(){
        return getWidth();
    }

    // Modifica el lado (actualiza largo y ancho)
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    // Sobrescribe setWidth para mantener forma de cuadrado
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    // Sobrescribe setLength para mantener forma de cuadrado
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    // Devuelve la información del cuadrado
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
