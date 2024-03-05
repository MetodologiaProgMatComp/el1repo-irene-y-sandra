package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rectangle2Test {

    @Test
    void testToString() {
        Rectangle2 f = new Rectangle2(8.9, 4.5);
        String salidaEsperada = "Rectangle2[width=8.9, length=4.5]";
        assertEquals(salidaEsperada, f.toString(), "No sale el mismo texto en toString()");
    }

    @Test
    void getArea() {
        Rectangle2 f = new Rectangle2(8.9, 4.5);
        assertEquals(8.9 * 4.5, f.getArea(), "Los areas no son iguales");

    }

    @Test
    void getPerimeter() {
        Rectangle2 f = new Rectangle2(8.9, 4.5);
        assertEquals((8.9 * 2) + (4.5 * 2), f.getPerimeter(), "Los areas no son iguales");
    }
}