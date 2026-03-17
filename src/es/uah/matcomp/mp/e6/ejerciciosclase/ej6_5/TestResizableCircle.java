package es.uah.matcomp.mp.e6.ejerciciosclase.ej6_5;

public class TestResizableCircle {
    public static void main(String[] args) {

        ResizableCircle c = new ResizableCircle(5);

        System.out.println("Inicial:");
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimetro: " + c.getPerimeter());

        c.resize(200);

        System.out.println("Despues de resize(200):");
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimetro: " + c.getPerimeter());
    }
}
