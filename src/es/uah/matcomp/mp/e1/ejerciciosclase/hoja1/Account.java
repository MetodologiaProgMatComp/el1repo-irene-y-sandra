package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

import java.security.KeyStore;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.name = name;
        this.id = id;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return balance + amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("El amount supera el balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.setBalance(amount);
        } else {
            System.out.println("El amount supera el balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" + "id='" + id + ", name='" + name + ", balance=" + balance + ']';
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}



