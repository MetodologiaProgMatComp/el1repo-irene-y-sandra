package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
    }

    @Test
    void setColor() {
        String newColor = "blue";
        Shape d = new Shape();
        assertDoesNotThrow(()->d.setColor(newColor));
        assertEquals(newColor,d.getColor(),"Los colores no son iguales");
    }

    @Test
    void isFilled() {
        Shape f = new Shape();
        assertTrue(f.isFilled());
    }

    @Test
    void setFilled() {
        boolean newFilled = false;
        Shape f = new Shape("black",true);
        assertDoesNotThrow(()->f.setFilled(newFilled));

    }

    @Test
    void testToString() {
        Shape f = new Shape("black",true);
        String salidaEsperada = "Shape[color='black, filled=true]";
        assertEquals(salidaEsperada,f.toString(),"Los textos no son iguales");
    }
}