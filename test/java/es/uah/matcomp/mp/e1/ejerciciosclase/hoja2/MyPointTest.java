package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    MyPoint punto = new MyPoint();
    MyPoint punto1 = new MyPoint(1,2);

    @Test
    void getX() {
        assertEquals(0,punto.getX());
        assertEquals(1,punto1.getX());
    }

    @Test
    void setX() {
        punto.setX(5);
        assertEquals(5, punto.getX());

    }

    @Test
    void getY() {
        assertEquals(0,punto.getY());
        assertEquals(2,punto1.getY());
    }

    @Test
    void setY() {
        punto1.setY(7);
        assertEquals(7, punto1.getY());
    }
    @Test
    void setXY() {
        punto1.setXY(3,4);
        int[] esperado = {punto1.getX(), punto1.getY()} ;
        assertArrayEquals(esperado,punto1.getXY());

    }

    @Test
    void getXY() {
        int[] esperado = {punto.getX(), punto.getY()};
        assertArrayEquals(esperado,punto.getXY());
    }

    @Test
    void testToString() {
        assertEquals("MyPoint[x=0, y=0]",punto.toString());
    }

    @Test
    void distance() {
        MyPoint centro = new MyPoint(0,0);
        assertEquals(5,centro.distance(3,4));
    }

    @Test
    void testDistance() {
        MyPoint centro = new MyPoint(0,0);
        MyPoint esperado = new MyPoint(3,4);
        assertEquals(5,centro.distance(esperado));
    }

    @Test
    void testDistance1() {
        punto.setXY(3,4);
        assertEquals(5,punto.distance());
    }
}