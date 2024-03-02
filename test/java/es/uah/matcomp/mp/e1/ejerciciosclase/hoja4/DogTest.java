package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
        Dog dog = new Dog("yiy");
        assertEquals("Woof",dog.greets());
    }

    @Test
    void testGreets() {
        Dog dog = new Dog("yiy");
        Dog dog2 = new Dog("yey");
        assertEquals("Woooof",dog.greets(dog2));
    }
}