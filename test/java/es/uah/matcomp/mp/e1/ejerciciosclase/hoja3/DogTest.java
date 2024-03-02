package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog = new Dog("Kiki");
    @Test
    void greets() {
        assertEquals("Woof",dog.greets());
    }

    @Test
    void testGreets() {
        Dog dog2 = new Dog("Violeta");
        assertEquals("Woooof", dog.greets(dog2));
    }

    @Test
    void testToString() {
        assertEquals("Dog[Mammal[Animal[name='Kiki]]]",dog.toString());
    }
}