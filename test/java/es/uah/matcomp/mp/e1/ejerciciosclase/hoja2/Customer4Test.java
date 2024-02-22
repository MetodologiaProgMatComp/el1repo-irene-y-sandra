package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Customer4Test {
    @Test
    void getId(){
        Customer4 d = new Customer4(5,"Sandra",23);

        assertEquals(5,d.getId(),"los id no son iguales ");

    }
    @Test
    void getName(){
        Customer4 d = new Customer4(5,"Sandra",23);

        assertEquals("Sandra",d.getName(),"los id no son iguales ");
    }
    @Test
    void getDiscount(){
    }
    @Test
    void setDiscount(){
        int newDiscount = 65;
        Customer4 d = new Customer4(5,"Sandra",23);

        assertDoesNotThrow(()->d.setDiscount(newDiscount));
        assertEquals(newDiscount,d.getDiscount(),"los discount no son iguales");

    }
    @Test
    void testToString(){
        Customer4 d = new Customer4(5,"Sandra",23);
        String salidaEsperada = "[Sandra(5)(23%)]";
        assertEquals(salidaEsperada,d.toString(),"los textos no son iguales");

    }
}