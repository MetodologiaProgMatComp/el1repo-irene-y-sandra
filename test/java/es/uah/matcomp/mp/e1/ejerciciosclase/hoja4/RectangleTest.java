package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
    }

    @Test
    void setLength() {
        double newLength = 3.2d;
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle();

        assertDoesNotThrow(()->d.setLength(newLength));

        assertEquals(newLength, d.getLength(), "Los length no son iguales");
    }

    @Test
    void getWidth() {
    }

    @Test
    void setWidth() {
        double newWidth = 8.9d;
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle();

        assertDoesNotThrow(()->d.setWidth(newWidth));

        assertEquals(newWidth, d.getWidth(), "Los width no son iguales");
    }

    @Test
    void getArea() {
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle(3.7,4.8);
        assertEquals(3.7*4.8,d.getArea(),"Los areas son distintos");
    }

    @Test
    void getPerimeter() {
        double newWidth = 3.9d;
        double newLength = 3.7d;
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle();

        assertDoesNotThrow(()->d.setLength(newLength));

        assertDoesNotThrow(()->d.setWidth(newWidth));

        assertEquals((3.9d*2)+(3.7d*2), d.getPerimeter(), "Las areas no son iguales");
    }

    @Test
    void testToString() {
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle f = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle("blue", false);
        assertEquals("blue",f.getColor(),"los colores no son iguales");
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja4.Rectangle("red", true,3.1,6.9);

        String salidaEsperada = "es.uah.matcomp.mp.e1.ejerciciosclase.Rectangle[Shape[color='red, filled=true]length=3.1 width=6.9]";
        assertEquals(salidaEsperada,d.toString(), "No sale el mismo texto en toString()");
    }
}