package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;

public class TestMyPoint{
    public static void main (String[] args){
        //Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); //Test constructor
        System.out.println(p1); // Test toString()

        p1.setX(8);
        p1.setY(9); //Test setters

        System.out.println("x is "+p1.getX());
        System.out.println("y is "+p1.getY()); //Test getters

        p1.setXY(5,7); //Test setXY()

        System.out.println(p1.getXY()[0]); //Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2= new MyPoint(0,4);
        System.out.println(p2);

        // Testing the overloaded methods distance()
        System.out.printf("%.2f",p1.distance(p2));
        // usa distance(MyPoint another)
        System.out.println();

        System.out.printf("%.2f",p2.distance());
        // usa distance(MyPoint another)
        System.out.println();

        System.out.printf("%.2f",p1.distance(5,6));
        // usa distance(int x, int y)
        System.out.println();

        System.out.printf("%.2f",p1.distance());
        // usa distance()
        System.out.println();

        MyPoint[] puntos =new MyPoint[10];

        for (int i=0; i < puntos.length; i++) {
            puntos[i]= new MyPoint(i+1,i+1);
        }
        System.out.println("\n Matriz de distancias: ");
        for (int i=0; i < puntos.length; i++){
            for (int j=0; j<puntos.length; j++){
                System.out.printf("%8.2f",puntos[i].distance(puntos[j]));
            }
            System.out.println();
        }


    }
}