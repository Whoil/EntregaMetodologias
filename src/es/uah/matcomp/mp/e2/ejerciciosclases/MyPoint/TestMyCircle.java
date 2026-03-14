package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;
public class TestMyCircle {
    public static void main(String[] args) {

        MyCircle c1 = new MyCircle();
        System.out.println("c1: " + c1);

        MyCircle c2 = new MyCircle(2, 3, 5);
        System.out.println("c2: " + c2);

        MyPoint p= new MyPoint(8,5);
        MyCircle c3= new MyCircle(p,7);
        System.out.println("c3: "+c3);

        //Test getGetRadius() and setRadius()
        c2.setRadius(10);
        System.out.println("c2 after setRadius(10): "+c2);

        //Test getCenter() and setCenter()
        c2.setCenter(new MyPoint(5,4));
        System.out.println("c2 center after setCenter(new MyPoint(5,4)) is: "+c2);

        //Test getCenterX(), getCenterY(), setCenterX() and setCenterY()
        System.out.println("c2 centerX is: "+c2.getCenterX() );
        System.out.println("c2 centerY is: " + c2.getCenterY());
        c2.setCenterX(1);
        c2.setCenterY(3);
        System.out.println("c1 center after setCenterX and setCenterY is: " + c2);

        //Test getCenterXY and setCenterXY
        System.out.println("c2 centerXY[0]:"+c2.getCenterXY()[0]);
        System.out.println("c2 centerXY[1]:"+c2.getCenterXY()[1]);
        c2.setCenterXY(4,4);
        System.out.println("c2 center after setCenterXY(4,4):"+c2);


        //Test getArea()
        System.out.printf("c2 area is: %.2f%n",c2.getArea());


        //Test getCircumference()
        System.out.printf("c2 circumference is: %.2f%n",c2.getCircumference());


        //Test distance()
        System.out.printf("Distance between c2 and c3 is: %.2f%n",c2.distance(c3));
        System.out.printf("Distance between c1 and c2 is: %.2f%n",c1.distance(c2));







    }
}
