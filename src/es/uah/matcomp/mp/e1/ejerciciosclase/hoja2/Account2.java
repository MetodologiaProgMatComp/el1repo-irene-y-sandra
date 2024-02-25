package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class Account2 {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Account2(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account2(int id, Customer costumer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public Customer getCostumer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        double balanceRed = Math.round(balance * 100.0) / 100.0;
        return customer.toString() + "balance=" + balanceRed;
    }

    public String getCostumerName() {
        return (String) customer.getName();
    }

    public Account2 deposit(double amount) {
        double sum = amount + balance;
        setBalance(sum);
        return this;
    }

    public Account2 withdraw(double amount) {
        if (balance >= amount) {
            double res = balance - amount;
            setBalance(res);
        }else{
            System.out.println("El amount excede al balance");
        }
        return this;
    }
}
