package es.uah.matcomp.mp.e6.ejerciciosclase;

// Clase que HEREDA de Rectangle
public class Square  extends Rectangle{

    // Constructor vacío
    public Square(){};

    // Constructor con lado
    public Square(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    // Constructor completo
    public Square(double side, String color, boolean filled){
        // Un cuadrado tiene width = length
        super.setWidth(side);
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
    }


    // Getter del lado
    public double getSide(){
        return super.getWidth();
    }
    // Setter del lado
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }



    // Asegura que siempre siga siendo cuadrado
    @Override
    public void setWidth(double side){
        setSide(side);
    }

    @Override
    public void setLength(double side){
        setSide(side);
    }

    // toString
    public String toString(){
        return "Square"+super.toString();
    }
}
