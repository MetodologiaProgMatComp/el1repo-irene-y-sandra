package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    MyPoint cent = new MyPoint(0,0);
    MyCircle circle = new MyCircle(cent,1);
    @Test
    void getCenter() {
        assertEquals("MyPoint[x=0, y=0]",circle.getCenter().toString());
    }

    @Test
    void setCenter() {
        MyPoint c2 = new MyPoint(1,1);
        circle.setCenter(c2);
        assertEquals("MyPoint[x=1, y=1]",circle.getCenter().toString());
    }

    @Test
    void getRadius() {
        assertEquals(1,circle.getRadius());
    }

    @Test
    void setRadius() {
        circle.setRadius(2);
        assertEquals(2,circle.getRadius());
    }

    @Test
    void getCenterX() {
        circle.setCenterXY(1,1);
        assertEquals(1,circle.getCenterX());
    }

    @Test
    void setCenterX() {
        circle.setCenterX(3);
        assertEquals(3,circle.getCenterX());
    }

    @Test
    void getCenterY() {
        circle.setCenterXY(1,1);
        assertEquals(1,circle.getCenterY());
    }

    @Test
    void setCenterY() {
        circle.setCenterY(3);
        assertEquals(3,circle.getCenterY());
    }

    @Test
    void getCenterXY() {
        int[] aux = {circle.getCenterX(), circle.getCenterY()};
        assertArrayEquals(aux,circle.getCenterXY());
    }

    @Test
    void setCenterXY() {
        circle.setCenterXY(1,1);
        int[] aux = {circle.getCenterX(), circle.getCenterY()};
        assertArrayEquals(aux,circle.getCenterXY());
    }

    @Test
    void testToString() {
        assertEquals("MyCircle[center=MyPoint[x=0, y=0], radius=1]",circle.toString());
    }

    @Test
    void getArea() {
        circle.setRadius(1);
        assertEquals(3.141592653589793,circle.getArea());
    }

    @Test
    void getCircumference() {
        assertEquals(6.283185307179586, circle.getCircumference());
    }

    @Test
    void distance() {
        circle.setCenter(cent);
        MyPoint p = new MyPoint(3,4);
        assertEquals(5, circle.distance(p));
    }
}