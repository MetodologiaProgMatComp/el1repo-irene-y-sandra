package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {//
    MovableCircle circle = new MovableCircle(1,1,0, 1, 2);
    @Test
    void moveUp() {
        circle.moveUp();
        assertEquals(1, circle.getCenter().getX());
        assertEquals(-2,circle.getCenter().getY());
    }

    @Test
    void moveDown() {
        MovableCircle circle1 = new MovableCircle(1,1,6, 1, 8);
        circle1.moveDown();
        assertEquals(1, circle1.getCenter().getX());
        assertEquals(14, circle1.getCenter().getY());
    }

    @Test
    void moveLeft() {
        MovableCircle circle1 = new MovableCircle(1,3,6, 1, 8);
        circle1.moveLeft();
        assertEquals(2, circle1.getCenter().getX());
        assertEquals(6, circle1.getCenter().getY());
    }

    @Test
    void moveRight() {
        MovableCircle circle1 = new MovableCircle(1,3,6, 1, 8);
        circle1.moveRight();
        assertEquals(4, circle1.getCenter().getX());
        assertEquals(6, circle1.getCenter().getY());
    }

    @Test
    void testToString() {
        MovableCircle circle1 = new MovableCircle(1,3,6, 1, 8);
        String salidaEsperada = "(3,6) Speed=(1,8) radius= 1";
        assertEquals(salidaEsperada,circle1.toString());
    }

    @Test
    void getRadius() {
    }

    @Test
    void setRadius() {
        MovableCircle circle1 = new MovableCircle(1,3,6, 1, 8);
        int newRadius = 3;
        assertDoesNotThrow(()->circle1.setRadius(newRadius));
        assertEquals(newRadius,circle1.getRadius());
    }

    @Test
    void getCenter() {
    }

    @Test
    void setCenter() {

        MovablePoint p1 = new MovablePoint(2,3,4,5);
        MovableCircle circle1 = new MovableCircle(1,p1);
        MovablePoint p2 = new MovablePoint(7,7,89,9);
        MovablePoint newCenter = p2;
        assertDoesNotThrow(()->circle1.setCenter(newCenter));
        assertEquals(newCenter,circle1.getCenter());
    }
}