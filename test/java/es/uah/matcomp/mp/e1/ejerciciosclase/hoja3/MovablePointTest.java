package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint p = new MovablePoint();

    @Test
    void getXSpeed() {
        assertEquals(0, p.getXSpeed());
    }

    @Test
    void setXSpeed() {
        p.setXSpeed(2);
        assertEquals(2, p.getXSpeed());
    }

    @Test
    void getYSpeed() {
        assertEquals(0, p.getYSpeed());

    }

    @Test
    void setYSpeed() {
        p.setYSpeed(3);
        assertEquals(3, p.getYSpeed());
    }

    @Test
    void setSpeed() {
        p.setSpeed(4, 5);
        float[] aux = {4.0f, 5.0f};
        assertArrayEquals(aux, p.getSpeed());
    }

    @Test
    void getSpeed() {
        p.setSpeed(4, 5);
        float[] aux = {4.0f, 5.0f};
        assertArrayEquals(aux, p.getSpeed());
    }

    @Test
    void testToString() {
        MovablePoint aux = new MovablePoint(4,5);
        assertEquals("(0.0,0.0)speed=(4.0,5.0)", aux.toString());
    }

    @Test
    void move() {
        MovablePoint point = new MovablePoint(2, 3, 1, 1);
        point.move();
        float[] aux = {3,4};
        assertArrayEquals(aux, point.getXY());
    }
}