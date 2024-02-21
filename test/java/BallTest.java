import es.uah.matcomp.mp.e1.ejerciciosclase.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    @Test
    void getX() {
    }

    @Test
    void setX() {
        float newX = 3.4f;
        Ball d = new Ball();

        assertDoesNotThrow(() -> d.setX(newX));

        assertEquals(newX,d.getX(), "Los X no son iguales");
    }

    @Test
    void getY() {
    }

    @Test
    void setY() {
        float newY = 3.9f;
        Ball d = new Ball();

        assertDoesNotThrow(() -> d.setY(newY));

        assertEquals(newY,d.getY(), "Los Y no son iguales");
    }

    @Test
    void getRadius() {
    }

    @Test
    void setRadius() {
        int newRadius = 35;
        Ball d = new Ball();

        assertDoesNotThrow(() -> d.setRadius(newRadius));

        assertEquals(newRadius,d.getRadius(), "Los radios no son iguales");
    }

    @Test
    void getXDelta() {
    }

    @Test
    void setXDelta() {
        float newXDelta = 3.7f;
        Ball d = new Ball();

        assertDoesNotThrow(() -> d.setXDelta(newXDelta));

        assertEquals(newXDelta,d.getXDelta(), "Los XDelta no son iguales");

    }

    @Test
    void getYDelta() {
    }

    @Test
    void setYDelta() {
        float newYDelta = 7.8f;
        Ball d = new Ball();

        assertDoesNotThrow(() -> d.setYDelta(newYDelta));

        assertEquals(newYDelta,d.getYDelta(), "Los YDelta no son iguales");

    }

    @Test
    void move() {
        float newX = 4.3f;
        float newY = 9.8f;
        float newXDelta = 3.2f;
        float newYDelta = 6.5f;
        Ball e = new Ball();

    }

    @Test
    void reflectHorizontal() {
    }

    @Test
    void reflectVertical() {
    }

    @Test
    void testToString() {
        float newX = 4.3f;
        float newY = 9.8f;
        float newXDelta = 3.2f;
        float newYDelta = 6.5f;
        Ball e = new Ball(4.3f,9.8f,67,3.2f,6.5f);
        String salidaEsperada = "es.uah.matcomp.mp.e1.ejerciciosclase.Ball[(4.3,9.8),speed(3.2,6.5)]";
        assertEquals(salidaEsperada,e.toString(),"No sale el mismo texto en toString()");
    }
}