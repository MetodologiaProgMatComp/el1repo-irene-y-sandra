package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Account2Test {
    Customer c = new Customer(123456789, "Pedro", 'm');
    Account2 a = new Account2(24680,c,30);
    @Test
    void getId() {
        assertEquals(24680, a.getId());
    }

    @Test
    void getCostumer() {
        assertEquals("Pedro(123456789)", a.getCostumer().toString());
    }

    @Test
    void getBalance() {
        assertEquals(30,a.getBalance());
    }

    @Test
    void setBalance() {
        a.setBalance(40);
        assertEquals(40, a.getBalance());
    }

    @Test
    void testToString() {
        assertEquals("Pedro(123456789)balance=30.0",a.toString());
    }

    @Test
    void getCostumerName() {
        assertEquals("Pedro",a.getCostumerName());
    }

    @Test
    void deposit() {
        a.deposit(15);
        assertEquals(45,a.getBalance());
    }

    @Test
    void withdraw() {
        a.withdraw(15);
        assertEquals(15,a.getBalance());
        a.withdraw(60);
    }
}