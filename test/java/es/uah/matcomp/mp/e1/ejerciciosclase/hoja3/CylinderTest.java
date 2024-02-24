package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
    }

    @Test
    void setHeight() {
        double newHeight = 8.0d;
        Cylinder f = new Cylinder();
        Cylinder g = new Cylinder(9.8d);
        Cylinder h = new Cylinder(4.5d, "red", 3.4d);

        assertDoesNotThrow(()-> f.setHeight(newHeight));
        assertEquals(newHeight,f.getHeight(), "los height no son iguales");
        assertDoesNotThrow(()-> g.setHeight(newHeight));
        assertEquals(newHeight,g.getHeight(), "los height no son iguales");
    }

    @Test
    void getVolume() {
        Cylinder g = new Cylinder(3.0,4.3);
        assertEquals(Math.PI*9.0*4.3, g.getVolume(), "los volumenes son distintos");
    }

    @Test
    void testToString() {
        Cylinder h = new Cylinder(6.7d,"red",3.4d);
        String salidaEsperada = "Cylinder: subclass of es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Circle[radius=6.7 color=red]height= 3.4";
        assertEquals(salidaEsperada,h.toString(),"los textos no son iguales");
    }
}

