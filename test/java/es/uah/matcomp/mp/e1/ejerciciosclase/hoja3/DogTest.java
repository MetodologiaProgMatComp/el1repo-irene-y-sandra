package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog = new Dog("Kiki");
    @Test
    void greets() {

    }

    @Test
    void testGreets() {
    }

    @Test
    void testToString() {
        assertEquals("Dog[Mammal[Animal[name='Kiki]]]",dog.toString());
    }
}