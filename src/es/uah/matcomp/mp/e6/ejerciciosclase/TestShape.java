package es.uah.matcomp.mp.e6.ejerciciosclase;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);  // Upcast Circle to Shape

        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());

        // Error de compilación:
        // la referencia es Shape, y Shape no tiene getRadius()



        Circle c1 = (Circle) s1;   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());    // Ahora sí porque c1 es de la clase Circle

        // Shape s2 = new Shape();

        // ERROR de compilación:
        // Shape es abstract, no se puede instanciar



        Shape s3 = new Rectangle(1.0, 2.0, "red", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());

        // Error de compilación:
        // La referencia es Shape y Shape no tiene getLength()



        Rectangle r1 = (Rectangle) s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());    // ahora sí, porque r1 es Rectangle


        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // System.out.println(s4.getSide());

        // Error de compilación:
        // La referencia es Shape y Shape no tiene getSide()



        // Take note that we downcast Shape s4 to Rectangle,
        // which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());

        // System.out.println(r2.getSide());

        // Error de compilación:
        // r2 es Rectangle y Rectangle no tiene getSide()


        System.out.println(r2.getLength());


        // Downcast Rectangle r2 to Square
        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        //Las clases abstract sirven como módelo o cuerpo común que van a seguir las clases hijas.
        //Por otro lado los métodos abstractos son métodos que van a heredar todas las subclases pero
        //que varían dependiendo de la subclase.
    }

}
