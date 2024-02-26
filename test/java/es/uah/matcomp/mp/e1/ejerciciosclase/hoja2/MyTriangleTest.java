package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void testToString() {
        MyPoint p1 = new MyPoint(3,4);
        MyPoint p2 = new MyPoint(5,6);
        MyPoint p3 = new MyPoint(7,8);
        MyTriangle y = new MyTriangle(p1,p2,p3);
        String salidaEsperada = "MyTriangle[v1=MyPoint[x=3, y=4], v2=MyPoint[x=5, y=6], v3=MyPoint[x=7, y=8]]";
        assertEquals(salidaEsperada, y.toString(), "Los textos no son iguales");
    }

    @Test
    void getPerimeter() {
        MyTriangle t1 = new MyTriangle(3,2,4,5,6,7);
        assertEquals((Math.sqrt(10.0)+(Math.sqrt(34))+(Math.sqrt(8))),t1.getPerimeter(), "los perimetros no son iguales");
    }

    @Test
    void getType() {
        MyTriangle t1 = new MyTriangle(3,2,4,5,6,7);
        assertEquals("Scalene",t1.getType(),"Los triangulos no son iguales");
        MyTriangle t2 = new MyTriangle(1,2,2,3,3,4);
        assertEquals("Isosceles",t2.getType(), "Los triangulos no son iguales");
        MyTriangle t3 = new MyTriangle(1,2,1,2,1,2);
        assertEquals("Equilateral",t3.getType(), "Los triangulos no son iguales");
    }
}