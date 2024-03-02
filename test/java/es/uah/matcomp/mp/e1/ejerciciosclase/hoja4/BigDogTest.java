package es.uah.matcomp.mp.e1.ejerciciosclase.hoja4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void greets() {
        BigDog bigDog = new BigDog("yoyo");
        assertEquals("Wooow",bigDog.greets());
    }

    @Test
    void testGreets() {
        BigDog bigDog = new BigDog("yoyo");
        Dog dog2 = new Dog("yoyo");
        assertEquals("Woooooow",bigDog.greets(dog2));
    }

    @Test
    void testGreets1() {
        BigDog bigDog = new BigDog("yoyo");
        BigDog bigDog2 = new BigDog("yoyo");
        assertEquals("Wooooooooow",bigDog.greets(bigDog2));
    }
}