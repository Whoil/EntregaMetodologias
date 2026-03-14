package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;

public class TestMyTriangle {
    public static void main(String[] args) {
        // Test constructors
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("t1: " + t1);
        MyPoint v1= new MyPoint(0,0);
        MyPoint v2= new MyPoint(1,1);
        MyPoint v3= new MyPoint(2,1);
        MyTriangle t2 = new MyTriangle(v1,v2,v3);
        System.out.println("t2:"+t2);

        //Test getPerimeter
        System.out.printf("t1 perimeter is: %.2f%n",t1.getPerimeter());
        System.out.printf("t2 perimeter is: %.2f%n",t2.getPerimeter());

        //Test getType
        System.out.println("t1 type: "+t1.getType());
        System.out.println("t2 type: "+ t2.getType());

        //More tests for triangle type
        MyTriangle equilatero =new MyTriangle(1,1,1,1,1,1);
        System.out.println("equilatero: " + equilatero);
        System.out.println("equilatero type: " + equilatero.getType());

        MyTriangle isosceles = new MyTriangle(0, 0, 2, 0, 1, 3);
        System.out.println("isosceles: " + isosceles);
        System.out.println("isosceles type: " + isosceles.getType());

        MyTriangle escaleno = new MyTriangle(0, 0, 4, 0, 1, 2);
        System.out.println("escaleno: " + escaleno);
        System.out.println("escaleno type: " + escaleno.getType());



    }
}