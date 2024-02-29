package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    void getHour() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(1,t1.getHour());
    }

    @Test
    void getMinute() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(2,t1.getMinute());
    }

    @Test
    void getSecond() {
        Time t1 = new Time(1, 2, 3);
        assertEquals(3,t1.getSecond());

    }

    @Test
    void setHour() {
        Time t1 = new Time(1, 2, 3);
        t1.setHour(4);
        assertEquals(4,t1.getHour());
    }

    @Test
    void setMinute() {
        Time t1 = new Time(1, 2, 3);
        t1.setMinute(5);
        assertEquals(5,t1.getMinute());

    }

    @Test
    void setSecond() {
        Time t1 = new Time(1, 2, 3);
        t1.setSecond(2);
        assertEquals(2,t1.getSecond());
    }

    @Test
    void setTime() {
        Time time = new Time(0, 0, 0);
        time.setTime(12, 30, 45);
        assertEquals(12, time.getHour());
        assertEquals(30,time.getMinute());
        assertEquals(45,time.getSecond());
    }

    @Test
    void testToString() {
        Time t1 = new Time(1, 2, 3);
        assertEquals("01:02:03",t1.toString());
    }

    @Test
    void nextSecond() {
        Time time = new Time(23, 59, 59);
        assertEquals("00:00:00",time.nextSecond().toString());
    }

    @Test
    void previousSecond() {
        Time time = new Time(0, 0, 0);
        assertEquals("23:59:59",time.previousSecond().toString());
    }


}
