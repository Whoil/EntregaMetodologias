package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;

public class TestMyLine {
    public static void main(String[] args){
        //Test program to test all constructors and public methods
        MyLine L1= new MyLine(5,3,7,8); //Test constructor number 1
        MyPoint p1= new MyPoint(2,6);
        MyPoint p2 = new MyPoint(9,5);
        MyLine L2= new MyLine(p1,p2); //Test cosntructor number 2
        System.out.println(L1); //Test toString()
        System.out.println(L2);
        // Test getBegin getEnd
        System.out.println("L1 begin is: "+L1.getBegin());
        System.out.println("L1 end is: "+L1.getEnd());

        //Test setBegin setEnd
        L1.setBegin(new MyPoint(1,2));
        L1.setEnd(new MyPoint(5,7));

        //Test getBeginX getBeginX getEndX getEndY
        System.out.println("BeginX is: "+ L1.getBeginX());
        System.out.println("BeginY is: "+ L1.getBeginY());
        System.out.println("EndX is: "+ L1.getEndX());
        System.out.println("EndY is: "+ L1.getEndY());

        //Test setBeginX setBeginY setEndX setEndY
        L1.setBeginX(7);
        L1.setBeginY(6);
        L1.setEndX(9);
        L1.setEndX(8);
        System.out.println("After setBeginX/Y and setEndX/Y: " + L1);

        //Test getBeginXY setBeginXY getEndXY setBeginXY
        System.out.println("BeginXY[0] is "+L1.getBeginXY()[0]);
        System.out.println("BeginXY[1] is "+L1.getBeginXY()[1]);
        System.out.println("End[0] is "+L1.getEndXY()[0]);
        System.out.println("End[1] is "+L1.getEndXY()[1]);

        //Test setBeginXY and setEndXY
        L1.setBeginXY(1,7);
        L1.setEndXY(5,8);
        System.out.println("After setBeginXY and setEndXY: "+L1);

        //Test getLength
        System.out.printf("Length is: %.2f",L1.getLength());

        System.out.println(); //Create space between the end and the beginning of getLength and getGradient methods

        //Test getGradient
        System.out.printf("The gradient is: %.2f",L1.getGradient());


    }


}