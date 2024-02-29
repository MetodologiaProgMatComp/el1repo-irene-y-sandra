package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class Invoice {
    private int id;
    private Customer4 customer;
    private double amount;



    public Invoice(int id, Customer4 customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer4 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer4 customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomer4Id(){
        return customer.getId();
    }
    public String getCustomer4Name(){
        return customer.getName();
    }
    public int getCustomer4Discount(){
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        double Descuento = 100-customer.getDiscount();
        double precioDescuento = amount*Descuento;
        return (precioDescuento/100); // imagino que el porcentaje, ya son los euros que hay quitar al precio total
    }

    @Override
    public String toString() {
        return "Invoice[" + "id=" + id + ", customer=" + customer.toString() + ", amount=" + amount + ']';
    }
}
