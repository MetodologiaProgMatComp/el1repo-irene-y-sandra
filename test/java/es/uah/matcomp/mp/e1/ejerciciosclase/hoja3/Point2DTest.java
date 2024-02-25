package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
    Point2D p = new Point2D();
    @Test
    void getX() {
        assertEquals(0,p.getX());
    }

    @Test
    void setX() {
        p.setX(2);
        assertEquals(2,p.getX());
    }

    @Test
    void getY() {
        assertEquals(0,p.getY());
    }

    @Test
    void setY() {
        p.setY(3);
        assertEquals(3,p.getY());
    }

    @Test
    void getXY() {
        float[] aux = {0,0};
        assertArrayEquals(aux,p.getXY());
    }

    @Test
    void setXY() {
        p.setXY(2,3);
        float[] aux = {2,3};
        assertArrayEquals(aux,p.getXY());
    }

    @Test
    void testToString() {
        Point2D punto = new Point2D(2,3);
        assertEquals("(x=2.0, y=3.0)",punto.toString());
    }
}