package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat gato = new Cat("Garfield");

    @Test
    void greets() {
        assertEquals("Meow", gato.greets());
    }
}