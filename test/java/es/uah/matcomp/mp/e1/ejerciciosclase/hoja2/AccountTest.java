package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account a = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("A101", a.getId());
    }

    @Test
    void getCostumer() {

    }

    @Test
    void getBalance() {
    }

    @Test
    void setBalance() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getCostumerName() {
    }

    @Test
    void deposit() {
    }

    @Test
    void withdraw() {
    }
}