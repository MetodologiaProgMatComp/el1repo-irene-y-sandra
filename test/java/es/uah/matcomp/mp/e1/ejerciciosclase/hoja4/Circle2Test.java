package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Circle2Test {

    @Test
    void testToString() {
        Circle2 d = new Circle2(4.5);
        String salidaEsperada = "Circle2[radius=4.5]";
        assertEquals(salidaEsperada, d.toString(), "Los textos no son iguales");
    }

    @Test
    void getArea() {
        Circle2 d = new Circle2(4.5);
        assertEquals(4.5 * 4.5 * Math.PI, d.getArea(), "Los areas no son iguales");
    }

    @Test
    void getPerimeter() {
        Circle2 d = new Circle2(4.5);
        assertEquals(2 * Math.PI * 4.5, d.getPerimeter(), "Los perimetros no son iguales");
    }
}