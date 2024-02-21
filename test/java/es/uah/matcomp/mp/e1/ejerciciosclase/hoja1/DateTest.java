package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void getDay() {
    }

    @Test
    void getMonth() {
    }

    @Test
    void getYear() {
    }

    @Test
    void setDay() {
        int newDay = 19;
        Date d= new Date();

        assertDoesNotThrow(() -> d.setDay(newDay));

        assertEquals(newDay,d.getDay(),"Los dias no son iguales");
    }

    @Test
    void setMonth() {
        int newMonth = 8;
        Date d= new Date();

        assertDoesNotThrow(() -> d.setMonth(newMonth));

        assertEquals(newMonth,d.getMonth(),"Los meses no son iguales");
    }

    @Test
    void setYear() {
        int newYear = 2005;
        Date d= new Date();

        assertDoesNotThrow(() -> d.setYear(newYear));

        assertEquals(newYear,d.getYear(),"Los años no son iguales");
    }

    @Test
    void setDate() {
        int newDay = 2;
        int newMonth = 4;
        int newYear = 2003;
        Date f= new Date(newDay,newMonth,newYear);

        assertDoesNotThrow(()-> f.setDate(newDay,newMonth,newYear));
    }

    @Test
    void testToString() {
        int newDay = 6;
        int newMonth = 9;
        int newYear = 2007;
        Date e = new Date();

        e.setDay(newDay);
        e.setMonth(newMonth);
        e.setYear(newYear);

        String salidaEsperada = "[6/9/2007]";
        assertEquals(salidaEsperada,e.toString(),"No sale el mismo texto en toString()");
    }
}