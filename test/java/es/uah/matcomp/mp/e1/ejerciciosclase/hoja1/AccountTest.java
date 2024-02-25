package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Account a = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("A101", a.getId());
    }

    @Test
    void getName() {
        Account a = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("Tan Ah Teck", a.getName());
    }

    @Test
    void getBalance() {
        Account a = new Account("A101", "Tan Ah Teck", 88);
        assertEquals(88, a.getBalance());
    }

    @Test
    void credit() {
        Account a = new Account("A101", "Tan Ah Teck", 88);
        assertEquals(100, a.credit(12));
    }

    @Test
    void debit() {
        Account a = new Account("A101", "Tan Ah Teck", 88);
        assertEquals(80, a.debit(8));
        a.debit(100);
    }

    @Test
    void transferTo() {
        Account nuevo = new Account("A102","Kiki");
        Account a = new Account("A101", "Tan Ah Teck", 88);
        a.transferTo(nuevo,12);
        assertEquals(12,nuevo.getBalance() );
        a.transferTo(nuevo,100);
    }

    @Test
    void testToString() {
        Account a = new Account("A101", "Tan Ah Teck", 88);
        assertEquals("Account[id='A101, name='Tan Ah Teck, balance=88]",a.toString());
    }

}