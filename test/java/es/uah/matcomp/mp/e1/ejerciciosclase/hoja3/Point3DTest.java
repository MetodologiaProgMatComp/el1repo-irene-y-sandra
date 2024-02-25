package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {
    Point3D p1 = new Point3D();
    @Test
    void getZ() {
        assertEquals(0.0f,p1.getZ());
    }

    @Test
    void setZ() {
        p1.setZ(1);
        assertEquals(1.0f,p1.getZ());
    }

    @Test
    void setXYZ() {
        p1.setXYZ(1,2,3);
        assertEquals(1,p1.getX());
        assertEquals(2,p1.getY());
        assertEquals(3,p1.getZ());
    }

    @Test
    void getXYZ() {
        Point3D smth = new Point3D(3);
        float[] aux = {0.0f,0.0f,3.0f};
        assertArrayEquals(aux, smth.getXYZ());
    }

    @Test
    void testToString() {
        assertEquals("(0.0,0.0,0.0)", p1.toString());
    }
}