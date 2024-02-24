package es.uah.matcomp.mp.e1.ejerciciosclase.hoja3;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle c = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle(3d);

        assertEquals(3d,c.getRadius(),"No ha devuelto el radio adecuado");
    }

    @Test
    void getArea() {
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle e = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle(4d);

        assertEquals(4*4*Math.PI,e.getArea(), "No ha devuleto el area adecuado" );
    }

    @Test
    void getColor() {
//
        //
    }

    @Test
    void setRadius() {
        double newRadius = 3.4d;
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle d = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle();

        assertDoesNotThrow(() -> d.setRadius(newRadius));

        assertEquals(newRadius,d.getRadius(), "Los radios no son iguales");

    }

    @Test
    void setColor() {
        String newColor = "red";
        es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle e = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle();

        assertDoesNotThrow(() -> e.setColor(newColor));

        assertEquals(newColor,e.getColor(),"Los colores no son iguales");






    }

    @Test
    void testToString() {

        es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle f = new es.uah.matcomp.mp.e1.ejerciciosclase.hoja3.Circle(3.4d, "red");


        String salidaEsperada = "es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Circle[radius=3.4 color=red]";
        assertEquals(salidaEsperada,f.toString(),"No sale el mismo texto en toString()");
    }




}