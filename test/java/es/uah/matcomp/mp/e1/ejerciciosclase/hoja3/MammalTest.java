package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {
    Animal animal = new Animal("Violeta");
    Mammal mammal = new Mammal("Salmona");
    @Test
    void testToString() {
        assertEquals("Mammal[Animal[name='Salmona]]", mammal.toString());
    }
}