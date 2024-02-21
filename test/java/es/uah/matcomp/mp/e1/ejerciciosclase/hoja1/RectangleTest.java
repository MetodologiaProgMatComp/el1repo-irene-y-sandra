package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getLength() {
    }

    @Test
    void setLength() {
        float newLength = 3.2f;
        Rectangle d = new Rectangle();

        assertDoesNotThrow(()->d.setLength(newLength));

        assertEquals(newLength, d.getLength(), "Los length no son iguales");
    }

    @Test
    void getWidth() {
    }

    @Test
    void setWidth() {
        float newWidth = 8.9f;
        Rectangle d = new Rectangle();

        assertDoesNotThrow(()->d.setWidth(newWidth));

        assertEquals(newWidth, d.getWidth(), "Los width no son iguales");
    }

    @Test
    void getArea() {
        float newWidth = 8.9f;
        float newLength = 3.2f;
        Rectangle d = new Rectangle();

        assertDoesNotThrow(()->d.setLength(newLength));

        assertDoesNotThrow(()->d.setWidth(newWidth));

        assertEquals(8.9f*3.2f, d.getArea(), "Las areas no son iguales");


    }

    @Test
    void getPerimeter() {
        float newWidth = 3.9f;
        float newLength = 3.7f;
        Rectangle d = new Rectangle();

        assertDoesNotThrow(()->d.setLength(newLength));

        assertDoesNotThrow(()->d.setWidth(newWidth));

        assertEquals((3.9f*2)+(3.7f*2), d.getPerimeter(), "Las areas no son iguales");
    }

    @Test
    void testToString() {
        //float newWidth = 6.9f;
        //float newLength = 3.1f;
        Rectangle d = new Rectangle(3.1f,6.9f);

        //d.setLength(newLength);
        //d.setWidth(newWidth);

        String salidaEsperada = "es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Rectangle[length=3.1 width=6.9]";
        assertEquals(salidaEsperada,d.toString(), "No sale el mismo texto en toString()");

    }
}