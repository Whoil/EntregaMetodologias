package es.uah.matcomp.mp.e6.ejerciciosclase;

import java.util.zip.Adler32;

public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;

    public Rectangle(){
        width=1.0;
        length=1.0;
    }
    public Rectangle (double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }

    public double getLength(){
        return width;
    }
    public void setLength(double length){
        this.length=length;
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return length*2+width*2;
    }

    public String toString(){
        return "Rectangle ["+super.toString()+", width= "+width+", length= "+length;
    }
}
