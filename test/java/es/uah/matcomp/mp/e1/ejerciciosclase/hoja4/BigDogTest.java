package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {
    BigDog perro = new BigDog("Husky");
    BigDog bigDog = new BigDog("Bernardo");
    Dog perrito = new Dog("Chihuahua");

    @Test
    void greets() {
        assertEquals("Woof", perro.greets());
    }

    @Test
    void testGreets() {
        assertEquals("Woooooooof", perro.greets(bigDog));
    }

    @Test
    void testGreets1() {
        assertEquals("Woooof", perro.greets(perrito));
    }
}