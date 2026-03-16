package es.uah.matcomp.mp.e6.ejerciciosclase.ej6_2;

public class TestGeometricObject {
    public static void main(String[] args){
        GeometricObject g1 = new Circle(7.56);
        System.out.println(g1.toString());
        System.out.println("Área del círculo 1= " + g1.getArea());
        System.out.println("Perímetro del círculo 1= " + g1.getPerimeter());

        GeometricObject g2 = new Rectangle(5.05,6.7);
        System.out.println(g2.toString());
        System.out.println("Área del círculo 1= " + g2.getArea());
        System.out.println("Perímetro del círculo 1= " + g2.getPerimeter());
    }
}
