package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {


    Time t1 = new Time(1, 2, 3);

    @Test
    void getHour() {

        System.out.println("Hour: " + t1.getHour());
    }

    @Test
    void getMinute() {
        System.out.println("Minute: " + t1.getMinute());
    }

    @Test
    void getSecond() {
        System.out.println("Second: " + t1.getSecond());
    }

    @Test
    void setHour() {
        t1.setHour(4);
        System.out.println(t1);
    }

    @Test
    void setMinute() {
        t1.setMinute(5);
        System.out.println(t1);
    }

    @Test
    void setSecond() {
        t1.setSecond(2);
        System.out.println(t1);
    }

    @Test
    void setTime() {
        Time time = new Time(0, 0, 0);
        time.setTime(12, 30, 45);
    }

    @Test
    void testToString() {
        Time time = new Time(9, 5, 0);
    }

    @Test
    void nextSecond() {
        Time time = new Time(23, 59, 59);
        time.nextSecond();
    }

    @Test
    void previousSecond() {
        Time time = new Time(0, 0, 0);
        time.previousSecond();
    }


}
