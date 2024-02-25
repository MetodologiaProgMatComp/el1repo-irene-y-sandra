package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal animal = new Animal("Violeta");
    @Test
    void testToString() {
        assertEquals("Animal[name='Violeta]",animal.toString());
    }
}