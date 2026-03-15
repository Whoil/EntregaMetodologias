package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        length= 1.0f;
        width= 1.0f;
    }
    public Rectangle(float length, float width){
        this.length=length;
        this.width= width;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float newLength){
        if (newLength < 0) {
            System.out.println("ERROR, la altura debe ser positiva");
        }
        else {
            length = newLength;
        }
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float newWidth){
        if (newWidth < 0) {
            System.out.println("ERROR, el ancho debe ser positivo");
        }
        else {
            width = newWidth;
        }
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length * 2) + (2 * width);
    }
    public String toString(){
        return "Rectangle [length=" + length + " ,width=" + width + "]";
    }
}
