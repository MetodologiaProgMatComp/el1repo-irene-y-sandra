package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat cat = new Cat("Kiki");
    @Test
    void greets() {
        assertEquals("Meow",cat.greets());
    }

    @Test
    void testToString() {
        assertEquals("Cat[Mammal[Animal[name='Kiki]]]",cat.toString());
    }
}