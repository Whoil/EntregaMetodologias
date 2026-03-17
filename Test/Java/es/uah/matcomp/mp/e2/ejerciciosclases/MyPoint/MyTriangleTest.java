package es.uah.matcomp.mp.e2.ejerciciosclases.MyPoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {


    @Test
    void MyTriangle(){
        MyPoint v1 = new MyPoint(0, 0);
        MyPoint v2 = new MyPoint(3, 0);
        MyPoint v3 = new MyPoint(0, 4);

        MyTriangle triangle = new MyTriangle(v1, v2, v3);

        assertEquals("MyTriangle=[v1=(0,0), v2=(3,0), v3=(0,4)]", triangle.toString());
        assertEquals(12.0, triangle.getPerimeter());
        assertEquals("Is Scalene", triangle.getType());

    }
    @Test
    void testToString() {
        MyTriangle triangle = new MyTriangle(0, 0, 3, 0, 0, 4);

        assertEquals("MyTriangle=[v1=(0,0), v2=(3,0), v3=(0,4)]", triangle.toString());

    }

    @Test
    void getPerimeter() {
        MyTriangle triangle = new MyTriangle(0, 0, 3, 0, 0, 4);

        assertEquals(12.0, triangle.getPerimeter());
    }

    @Test
    void getType() {
        MyTriangle triangle = new MyTriangle(0, 0, 3, 0, 0, 4);

        assertEquals("Is Scalene", triangle.getType());
    }
    @Test
    void getTypeIsosceles() {
        MyTriangle triangle = new MyTriangle(0, 0, 2, 0, 1, 1);

        assertEquals("Is Isosceles", triangle.getType());
    }
}