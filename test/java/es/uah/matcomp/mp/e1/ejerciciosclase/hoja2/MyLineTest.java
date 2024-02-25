package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {
    MyLine l1 = new MyLine(0,0,2,3);
    MyPoint p1 = new MyPoint(3,4);
    MyPoint p2 = new MyPoint(0,0);
    MyLine l2 = new MyLine(p2,p1);

    @Test
    void getBegin() {
        assertEquals("MyPoint[x=0, y=0]", l2.getBegin().toString());
    }

    @Test
    void setBegin() {
        l1.setBegin(p1);
        assertEquals("MyPoint[x=3, y=4]",l1.getBegin().toString());
    }

    @Test
    void getEnd() {
        assertEquals("MyPoint[x=2, y=3]",l1.getEnd().toString());
    }

    @Test
    void setEnd() {
        l1.setEnd(p1);
        assertEquals("MyPoint[x=3, y=4]",l1.getEnd().toString());
    }

    @Test
    void getBeginX() {
        assertEquals(0,l2.getBeginX());
    }

    @Test
    void setBeginX() {
        l2.setBeginX(1);
        assertEquals(1,l2.getBeginX());
    }

    @Test
    void getBeginY() {
        assertEquals(0,l2.getBeginY());
    }

    @Test
    void setBeginY() {
        l2.setBeginY(1);
        assertEquals(1,l2.getBeginY());
    }

    @Test
    void getEndX() {
        assertEquals(3,l2.getEndX());
    }

    @Test
    void setEndX() {
        l2.setEndX(4);
        assertEquals(4,l2.getEndX());
    }

    @Test
    void getEndY() {
        assertEquals(4,l2.getEndY());
    }

    @Test
    void setEndY() {
        l2.setEndY(3);
        assertEquals(3,l2.getEndY());
    }

    @Test
    void getBeginXY() {
        int[] aux = {l2.getBeginX(), l2.getBeginY()};
        assertArrayEquals(aux, l2.getBeginXY());
    }

    @Test
    void getEndXY() {
        int[] aux = {l2.getEndX(), l2.getEndY()};
        assertArrayEquals(aux, l2.getEndXY());
    }

    @Test
    void setBeginXY() {
        l2.setBeginXY(3,4);
        int[] aux = {l2.getBeginX(), l2.getBeginY()};
        assertArrayEquals(aux, l2.getBeginXY());
    }

    @Test
    void setEndXY() {
        l2.setEndXY(4,3);
        int[] aux = {l2.getEndX(), l2.getEndY()};
        assertArrayEquals(aux, l2.getEndXY());
    }

    @Test
    void getLength() {
        l1.setBeginXY(0,0);
        l1.setEndXY(3,4);
        assertEquals(5,l1.getLength());

    }

    @Test
    void getGradient() {
        l1.setEndXY(4,4);
        assertEquals(45,l1.getGradient());
    }

    @Test
    void testToString() {
        assertEquals("MyLine{begin=MyPoint[x=0, y=0], end=MyPoint[x=2, y=3]}", l1.toString());
    }
}