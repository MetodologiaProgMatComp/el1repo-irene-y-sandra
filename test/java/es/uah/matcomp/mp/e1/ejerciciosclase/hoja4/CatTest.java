package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {
        Cat cat = new Cat("kiki");
        assertEquals("Meow",cat.greets());
    }
}