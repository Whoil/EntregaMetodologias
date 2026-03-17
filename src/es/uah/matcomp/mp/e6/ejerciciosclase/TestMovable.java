package es.uah.matcomp.mp.e6.ejerciciosclase;

public class TestMovable {
    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(1, 2, 3, 4);
        System.out.println("Punto inicial: " + p);

        p.moveUp();
        System.out.println("Después de moveUp: " + p);

        p.moveRight();
        System.out.println("Después de moveRight: " + p);

        p.moveDown();
        System.out.println("Después de moveDown: " + p);

        p.moveLeft();
        System.out.println("Después de moveLeft: " + p);

        System.out.println();

        MovableCircle c = new MovableCircle(5, 5, 2, 2, 10);
        System.out.println("Círculo inicial: " + c);

        c.moveUp();
        System.out.println("Después de moveUp: " + c);

        c.moveRight();
        System.out.println("Después de moveRight: " + c);

        c.moveDown();
        System.out.println("Después de moveDown: " + c);

        c.moveLeft();
        System.out.println("Después de moveLeft: " + c);
    }
}
