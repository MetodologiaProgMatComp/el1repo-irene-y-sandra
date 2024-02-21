package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
    }

    @Test
    void getName() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void credit() {
    }

    @Test
    void debit() {
    }

    @Test
    void transferTo() {
    }

    @Test
    void testToString() {
    }

    public static void main(String[] args) {
        // Test constructor and toString()
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1); // toString(); //s: los parametros que salen
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2); //S: los parametros que salen + balance=0
        // Test Getters
        System.out.println("ID: " + a1.getId()); //A101
        System.out.println("Name: " + a1.getName()); //Tan Ah Teck
        System.out.println("Balance: " + a1.getBalance()); // 88
        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1); //Balance 188 pero sale 88
        a1.debit(50);
        System.out.println(a1); // Balance 38
        a1.debit(500); // debit() error
        System.out.println(a1); //error
        // Test transfer()
        a1.transferTo(a2, 100); // toString()
        System.out.println(a1);
        System.out.println(a2);
    }
}