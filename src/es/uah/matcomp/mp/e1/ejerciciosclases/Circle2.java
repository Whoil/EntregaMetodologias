package es.uah.matcomp.mp.e1.ejerciciosclases;

public class Circle2 {
    private double radius;

    public Circle2(){
        radius= 1.0;
    }
    public Circle2(double radius){
        this.radius= radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        if (newRadius < 0) {
            System.out.println("ERROR, el radio debe ser positivo");
        }
        else {
            radius = newRadius;
        }
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return 2 * radius * Math.PI;
    }
    public String toString(){
        return "Circle [radius=" + radius + "]";
    }
}
