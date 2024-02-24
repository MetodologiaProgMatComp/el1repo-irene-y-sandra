package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person d = new Person("Eva", "Calle Abril");
        assertEquals("Eva", d.getName(),"los name no son iguales");
    }

    @Test
    void getAddress() {

    }

    @Test
    void setAddress() {
        String newAddress = "Calle Bingo";
        Person g = new Person("Gustavo", "Calle Sopa");
        assertDoesNotThrow(()->g.setAddress(newAddress));
        assertEquals(newAddress,g.getAddress(),"las address no son iguales");
    }

    @Test
    void testToString() {
        Person h = new Person("Pol", "Calle Sopa");
        String salidaEsperada = "Person[name='Pol, address='Calle Sopa]";
        assertEquals(salidaEsperada,h.toString(),"los textos no son iguales");
    }
}