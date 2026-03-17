package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void MyCircle(){
        MyCircle circle = new MyCircle();

        assertEquals(0, circle.getRadius());
        assertEquals(0, circle.getCenterX());
        assertEquals(0, circle.getCenterY());
    }
    @Test
    void getRadius() {
        MyCircle circle = new MyCircle(2, 3, 5);

        assertEquals(5, circle.getRadius());
    }

    @Test
    void setRadius() {
        MyCircle circle = new MyCircle(2, 3, 5);

        circle.setRadius(8);

        assertEquals(8, circle.getRadius());
    }

    @Test
    void getCenter() {
        MyPoint center = new MyPoint(2, 3);
        MyCircle circle = new MyCircle(center, 5);

        assertSame(center, circle.getCenter());
    }

    @Test
    void setCenter() {
        MyCircle circle = new MyCircle(1, 1, 5);
        MyPoint center = new MyPoint(2, 3);

        circle.setCenter(center);

        assertEquals(2, circle.getCenterX());
        assertEquals(3, circle.getCenterY());
    }

    @Test
    void getCenterX() {
        MyCircle circle = new MyCircle(2, 3, 5);

        assertEquals(2, circle.getCenterX());
    }

    @Test
    void setCenterX() {
        MyCircle circle = new MyCircle(2, 3, 5);

        circle.setCenterX(6);

        assertEquals(6, circle.getCenterX());
    }

    @Test
    void getCenterY() {
        MyCircle circle = new MyCircle(2, 3, 5);

        assertEquals(3, circle.getCenterY());
    }

    @Test
    void setCenterY() {
        MyCircle circle = new MyCircle(2, 3, 5);

        circle.setCenterY(7);

        assertEquals(7, circle.getCenterY());
    }

    @Test
    void getCenterXY() {
        MyCircle circle = new MyCircle(2, 3, 5);

        circle.setCenterY(7);

        assertEquals(7, circle.getCenterY());
    }

    @Test
    void setCenterXY() {
        MyCircle circle = new MyCircle(2, 3, 5);

        circle.setCenterXY(8, 9);

        assertArrayEquals(new int[]{8, 9}, circle.getCenterXY());
    }

    @Test
    void testToString() {
        MyCircle circle = new MyCircle(2, 3, 5);

        assertEquals("MyCircle [radius=5,(2,3)", circle.toString());

    }

    @Test
    void getArea() {
        MyCircle circle = new MyCircle(0, 0, 2);

        assertEquals(Math.PI * 4, circle.getArea());
    }

    @Test
    void getCircumference() {
        MyCircle circle = new MyCircle(0, 0, 2);

        assertEquals(Math.PI * 4, circle.getCircumference());

    }

    @Test
    void distance() {
        MyCircle circle1 = new MyCircle(0, 0, 2);
        MyCircle circle2 = new MyCircle(3, 4, 1);

        assertEquals(5.0, circle1.distance(circle2));

    }
}