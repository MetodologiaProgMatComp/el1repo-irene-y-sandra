package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint point = new MovablePoint(0, 0, 1, 1);
    @Test
    void testToString() {
        MovablePoint point = new MovablePoint(3, 4, 2, 1);
        assertEquals("(3,4) Speed=(2,1)", point.toString());
    }

    @Test
    void moveUp() {
        point.moveUp();
        assertEquals(0, point.getX());
        assertEquals(-1, point.getY());
    }

    @Test
    void moveDown() {
        point.moveDown();
        assertEquals(0, point.getX());
        assertEquals(1, point.getY());
    }

    @Test
    void moveLeft() {
        point.moveLeft();
        assertEquals(-1, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void moveRight() {
        point.moveRight();
        assertEquals(1, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void getX() {
        assertEquals(0,point.getX());
    }

    @Test
    void getY() {
        assertEquals(0,point.getY());
    }

    @Test
    void setX() {
        point.setX(1);
        assertEquals(1,point.getX());
    }

    @Test
    void setY() {
        point.setY(1);
        assertEquals(1,point.getY());
    }

    @Test
    void setxSpeed() {
        point.setxSpeed(2);
        assertEquals(2,point.getxSpeed());
    }

    @Test
    void setySpeed() {
        point.setySpeed(2);
        assertEquals(2,point.getySpeed());
    }

    @Test
    void getxSpeed() {
        assertEquals(1,point.getxSpeed());
    }

    @Test
    void getySpeed() {
        assertEquals(1,point.getySpeed());
    }
}