package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    Point p = new Point();
    @Test
    void getX() {
        assertEquals(0.0f,p.getX());
    }

    @Test
    void setX() {
        p.setX(2);
        assertEquals(2.00f,p.getX());
    }

    @Test
    void getY() {
        assertEquals(0,p.getY());
    }

    @Test
    void setY() {
        p.setY(4);
        assertEquals(4,p.getY());
    }

    @Test
    void getXY() {
        float[] aux = {0,0};
        assertArrayEquals(aux,p.getXY());
    }

    @Test
    void setXY() {
        float[] aux = {2,3};
        p.setXY(2,3);
        assertArrayEquals(aux,p.getXY());
    }

    @Test
    void testToString() {
        Point p1 = new Point(2,3);
        assertEquals("(2.0,3.0)", p1.toString());
    }
}