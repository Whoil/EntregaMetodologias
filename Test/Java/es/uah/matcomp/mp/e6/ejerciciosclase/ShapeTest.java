package es.uah.matcomp.mp.e6.ejerciciosclase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    private Shape createShape() {
        return new Shape() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
    }

    private Shape createShape(String color, boolean filled) {
        return new Shape(color, filled) {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double getPerimeter() {
                return 0;
            }
        };
    }

    @Test
    void constructorVacio() {
        Shape s = createShape();
        assertEquals("red ", s.getColor());
        assertTrue(s.isFilled());
    }

    @Test
    void constructorConParametros() {
        Shape s = createShape("blue", false);
        assertEquals("blue", s.getColor());
        assertFalse(s.isFilled());
    }

    @Test
    void getColor() {
        Shape s = createShape();
        s.setColor("green");
        assertEquals("green", s.getColor());
    }

    @Test
    void setColor() {
        Shape s = createShape();
        s.setColor("yellow");
        assertEquals("yellow", s.getColor());
    }

    @Test
    void isFilled() {
        Shape s = createShape();
        assertTrue(s.isFilled());
    }

    @Test
    void setFilled() {
        Shape s = createShape();
        s.setFilled(false);
        assertFalse(s.isFilled());
    }

    @Test
    void testToString() {
        Shape s = createShape();
        assertEquals("Shape [color=red , filler=true]", s.toString());
    }
}