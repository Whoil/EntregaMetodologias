package es.uah.matcomp.mp.e6.ejerciciosclase.ej6_5;

public class TestCircle {
    public static void main(String[] args) {
        Circle c = new Circle(5);

        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimetro: " + c.getPerimeter());
    }
}
