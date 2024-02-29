package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
    }

    @Test
    void setRadius() {
        double newRadius = 3.4d;
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle();

        assertDoesNotThrow(() -> d.setRadius(newRadius));

        assertEquals(newRadius,d.getRadius(), "Los radios no son iguales");
    }

    @Test
    void getArea() {

        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle(3.4);
        assertEquals(3.4*3.4*Math.PI,d.getArea(),"Los areas no son iguales");

    }

    @Test
    void getPerimeter() {
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle(3.4);
        assertEquals(2*Math.PI*3.4,d.getPerimeter(),"Los perimetros no son iguales");
    }

    @Test
    void testToString() {
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle("red",true,3.4);
        String salidaEsperada = "es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Circle[Shape[color='red, filled=true], radius=3.4]";
        assertEquals(salidaEsperada, d.toString(), "los textos no son iguales");

    }
}