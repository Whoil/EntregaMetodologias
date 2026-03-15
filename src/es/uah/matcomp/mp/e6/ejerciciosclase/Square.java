package es.uah.matcomp.mp.e6.ejerciciosclase;

public class Square  extends Rectangle{

    public Square(){};

    public Square(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public Square(double side, String color, boolean filled){
        super.setWidth(side);
        super.setLength(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        setSide(side);
    }
    @Override
    public void setLength(double side){
        setSide(side);
    }
    public String toString(){
        return "Square"+super.toString();
    }
}
