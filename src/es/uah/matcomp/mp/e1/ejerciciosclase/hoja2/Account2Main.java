package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

public class Account2Main {
    public static void main(String[] args){
        //Test Customer class
        Customer c1 = new Customer(88, "Tan Ah Teck", 'm');
        System.out.println(c1); // Customer's toString()
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getGender());

        //Test Account class
        Account2 a2= new Account2(123,c1,9.8);
        System.out.println(a2);
        a2.setBalance(6.7);
        System.out.println(a2);
        System.out.println("id is: " + a2.getId());
        System.out.println("Customer is: " + a2.getCostumer());
        System.out.println("balance is: " + a2.getBalance());
        System.out.println("Customer's name is:" + a2.getCostumerName());
        System.out.println(a2.deposit(7.8));
        System.out.println(a2.withdraw(3.4));

    }
}
