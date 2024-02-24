package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
    }

    @Test
    void setProgram() {
        String newProgram = "Programa2";
        Student d = new Student("Eva","Calle Sol","Programa1",2019,567.9);
        assertDoesNotThrow(()->d.setProgram(newProgram));
        assertEquals(newProgram,d.getProgram(),"los program no los iguales");
    }

    @Test
    void getYear() {
    }

    @Test
    void setYear() {
        int newYear = 2005;
        Student d = new Student("Eva","Calle Sol","Programa1",2019,567.9);
        assertDoesNotThrow(()->d.setYear(newYear));
        assertEquals(newYear,d.getYear(),"los year no los iguales");
    }

    @Test
    void getFee() {
    }

    @Test
    void setFee() {
        double newFee = 897.9;
        Student d = new Student("Eva","Calle Sol","Programa1",2019,567.9);
        assertDoesNotThrow(()->d.setFee(newFee));
        assertEquals(newFee,d.getFee(),"los fee no los iguales");
    }

    @Test
    void testToString() {
        Student d = new Student("Eva","Calle Sol","Programa1",2019,567.9);
        String salidaEsperada="Student[Person[name='Eva, address='Calle Sol]program='Programa1, year=2019, fee=567.9]";

        assertEquals(salidaEsperada,d.toString(),"los textos no son iguales");

    }
}