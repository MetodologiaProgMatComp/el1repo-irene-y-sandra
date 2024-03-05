package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog d = new Dog("Perro");
    Dog d2 = new Dog("otro");

    @Test
    void greets() {
        assertEquals("Woof", d.greets());
    }

    @Test
    void testGreets() {
        assertEquals("Woooof", d.greets(d2));
    }
}