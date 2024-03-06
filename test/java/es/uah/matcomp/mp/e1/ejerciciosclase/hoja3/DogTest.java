package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog = new Dog("Kiki");
    Dog d2 = new Dog("Violeta");
    @Test
    void greets() {
        assertEquals("Woof",dog.greets());
    }

    @Test
    void testGreets() {
        assertEquals("Woooof", dog.greets(d2));
    }

    @Test
    void testToString() {
        assertEquals("Dog[Mammal[Animal[name='Kiki]]]",dog.toString());
    }
}