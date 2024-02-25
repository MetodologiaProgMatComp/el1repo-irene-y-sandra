package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Customer c = new Customer(123456789, "Pedro", 'm');
    @Test
    void getId() {
        assertEquals(123456789,c.getId());
    }

    @Test
    void getName() {
        assertEquals("Pedro", c.getName());
    }

    @Test
    void getGender() {
        assertEquals('m', c.getGender());
    }

    @Test
    void testToString() {
        assertEquals("Pedro(123456789)", c.toString());
    }
}