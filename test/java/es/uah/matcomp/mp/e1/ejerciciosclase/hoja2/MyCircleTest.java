package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    @Test
    void Constructor(){
        MyCircle p3 = new MyCircle();
        assertNotNull(p3);
    }

    @Test
    void getCenter(){}

    @Test
    void setCenter() {
       MyPoint p1 = new MyPoint(3,4);
       MyCircle c1 = new MyCircle(p1,3);
       MyPoint p2 = new MyPoint(8,9);
       MyPoint newPoint = p2;
       assertDoesNotThrow(()->c1.setCenter(newPoint));
       assertEquals(newPoint,c1.getCenter());

    }

    @Test
    void getRadius() {

    }

    @Test
    void setRadius() {
        MyCircle c1 = new MyCircle(2,3,5);
        int newRadius = 8;
        assertDoesNotThrow(()->c1.setRadius(newRadius));
        assertEquals(newRadius,c1.getRadius());
    }

    @Test
    void getCenterX() {

    }

    @Test
    void setCenterX() {
        MyCircle c1 = new MyCircle(2,3,5);
        int newCenterX = 8;
        assertDoesNotThrow(()->c1.setCenterX(newCenterX));
        assertEquals(newCenterX,c1.getCenterX());
    }

    @Test
    void getCenterY() {

    }

    @Test
    void setCenterY() {
        MyCircle c1 = new MyCircle(2,3,5);
        int newCenterY = 8;
        assertDoesNotThrow(()->c1.setCenterY(newCenterY));
        assertEquals(newCenterY,c1.getCenterY());

    }

    @Test
    void getCenterXY() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle c1 = new MyCircle(p1,3);
        assertEquals(c1.getCenterXY()[0],3);
        assertEquals(c1.getCenterXY()[1],4);
    }

    @Test
    void setCenterXY() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle c1 = new MyCircle(p1,3);
        c1.setCenterXY(9,8);
        assertEquals(c1.getCenterX(),9);
        assertEquals(c1.getCenterY(),8);


    }

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle c1 = new MyCircle(p1,3);
        String salidaEsperada = "MyCircle[center=MyPoint[x=3, y=4], radius=3]";
        assertEquals(salidaEsperada,c1.toString());
    }

    @Test
    void getArea() {
        MyCircle c1 = new MyCircle(2,3,5);
        assertEquals(5*5*Math.PI,c1.getArea());
    }

    @Test
    void getCircumference() {
        MyCircle c1 = new MyCircle(2,3,5);
        assertEquals(2*5*Math.PI,c1.getCircumference());
    }

    @Test
    void distance() {
        MyPoint p1 = new MyPoint(3,4);
        MyCircle c1 = new MyCircle(p1,3);
        MyPoint p2 = new MyPoint(5,6);

        assertEquals(2.8284271247461903,c1.distance(p2));
    }

}