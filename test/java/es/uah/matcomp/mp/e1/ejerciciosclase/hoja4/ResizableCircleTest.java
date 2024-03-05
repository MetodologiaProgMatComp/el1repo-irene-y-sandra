package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResizableCircleTest {

    @Test
    void testToString() {
        ResizableCircle d = new ResizableCircle(6.5);
        String salidaEsperada = "ResizableCircle[radius=6.5]";
        assertEquals(salidaEsperada, d.toString(), "Los textos no son iguales");

    }

    @Test
    void resize() {
        int newPercent = 20;
        ResizableCircle d = new ResizableCircle(9.8);
        assertDoesNotThrow(() -> d.resize(newPercent));
    }
}