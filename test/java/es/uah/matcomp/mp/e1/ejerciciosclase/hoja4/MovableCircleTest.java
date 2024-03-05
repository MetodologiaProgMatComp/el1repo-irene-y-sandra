package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {
    MovableCircle circle = new MovableCircle(1, 0, 0, 1, 2);

    @Test
    void moveUp() {
        circle.moveUp();
        assertEquals(0, circle.getCenter().getX());
        assertEquals(-2, circle.getCenter().getY());
    }

    @Test
    void moveDown() {
    }

    @Test
    void moveLeft() {
    }

    @Test
    void moveRight() {
    }

    @Test
    void testToString() {
    }

    @Test
    void testMoveUp() {
    }

    @Test
    void testMoveDown() {
    }

    @Test
    void testMoveLeft() {
    }

    @Test
    void testMoveRight() {
    }

    @Test
    void testToString1() {
    }

    @Test
    void getRadius() {
    }

    @Test
    void setRadius() {
    }

    @Test
    void getCenter() {
    }

    @Test
    void setCenter() {
    }
}