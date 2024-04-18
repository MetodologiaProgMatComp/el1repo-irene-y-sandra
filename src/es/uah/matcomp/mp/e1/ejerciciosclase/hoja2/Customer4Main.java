package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class Customer4Main {
    public static void main(String[] args) {
        // Test Customer class
        Customer4 c1 = new Customer4(88, "Tan Ah Teck", 10);
        System.out.println(c1); // Customer's toString()
        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());
        // Test Invoice class
        Invoice inv1 = new Invoice(101, c1, 888.8);
        System.out.println(inv1);
        inv1.setAmount(999.9);
        Customer4 c2 = new Customer4(99, "Elena", 8);
        inv1.setCustomer(c2);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer()); // Customer's toString()
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomer4Id());
        System.out.println("customer's name is: " + inv1.getCustomer4Name());
        System.out.println("customer's discount is: " + inv1.getCustomer4Discount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
    }
}