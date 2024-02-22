package es.uah.matcomp.mp.e1.ejerciciosclase.hoja2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InvoiceTest {
    @Test
    void getId(){
        Customer4 h = new Customer4(2,"Eva",67);
        Invoice f = new Invoice(7,h,89);

        assertEquals(7,f.getId(),"los id no son iguales");
    }
    @Test
    void getCustomer(){
    }
    @Test
    void setCustomer(){
        Customer4 i = new Customer4(3,"Jorge", 34);
        Customer4 newCustomer = i;
        Customer4 h = new Customer4(2,"Eva",67);
        Invoice f = new Invoice(7,h,89);
        assertDoesNotThrow(()->f.setCustomer(newCustomer));
        assertEquals(newCustomer,f.getCustomer(),"los Customer no son iguales");
    }
    @Test
    void getAmount(){
    }
    @Test
    void setAmount(){
        double newAmount = 34;
        Customer4 h = new Customer4(2,"Eva",67);
        Invoice f = new Invoice(7,h,89);
        assertDoesNotThrow(()->f.setAmount(newAmount));
        assertEquals(newAmount,f.getAmount(),"los amount no son iguales");



    }
    @Test
    void getCustomer4Id(){
        Customer4 h = new Customer4(2,"Eva",67);
        Invoice f = new Invoice(7,h,89);
        assertEquals(2,f.getCustomer4Id(), "los id no son iguales");
    }
    @Test
    void getCustomer4Name(){
        Customer4 h = new Customer4(2,"Eva",67);
        Invoice f = new Invoice(7,h,89);
        assertEquals("Eva",f.getCustomer4Name(), "los name no son iguales");
    }
    @Test
    void getCustomer4Discount(){
        Customer4 h = new Customer4(2,"Eva",67);
        Invoice f = new Invoice(7,h,89);
        assertEquals(67,f.getCustomer4Discount(), "los name no son iguales");
    }
    @Test
    void getAmountAfterDiscount(){
        Customer4 h = new Customer4(2,"Eva",67);
        Invoice f = new Invoice(7,h,89);
        assertEquals(89*(0.33),f.getAmountAfterDiscount(),"los AmountAfterDiscount no son iguales");
    }
    @Test
    void testToString(){
        Customer4 h = new Customer4(2,"Eva",67);
        Invoice f = new Invoice(7,h,89);
        String salidaEsperada = "Invoice[id=7, customer=[Eva(2)(67%)], amount=89.0]";
        assertEquals(salidaEsperada,f.toString(),"los textos no son iguales");
    }
}