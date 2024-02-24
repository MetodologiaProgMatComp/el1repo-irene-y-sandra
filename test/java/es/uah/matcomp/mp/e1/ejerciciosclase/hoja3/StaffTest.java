package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
    }

    @Test
    void setSchool() {
        String newSchool = "Los patos";
        Staff d = new Staff("Lucas", "Calle Rus", "Los Reyes", 89.65d);
        assertDoesNotThrow(()->d.setSchool(newSchool));
        assertEquals(newSchool, d.getSchool(),"Los school no son iguales");

    }

    @Test
    void getPay() {
    }

    @Test
    void setPay() {
        double newPay = 67.54d;

        Staff d = new Staff("Lucas", "Calle Rus", "Los Reyes", 89.65d);
        assertDoesNotThrow(()->d.setPay(newPay));
        assertEquals(newPay, d.getPay(),"Los school no son iguales");
    }

    @Test
    void testToString() {
        Staff d = new Staff("Eva", "Calle Sol", "Los Reyes", 89.65d);
        String salidaEsperada="Staff[Person[name='Eva, address='Calle Sol]school='Los Reyes, pay=89.65]";

        assertEquals(salidaEsperada,d.toString(),"los textos no son iguales");
    }
}