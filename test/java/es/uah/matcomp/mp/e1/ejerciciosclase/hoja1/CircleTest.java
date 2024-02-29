package es.uah.matcomp.mp.e1.ejerciciosclase.hoja1;

import es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle c = new Circle(3d);

        assertEquals(3d,c.getRadius(),"No ha devuelto el radio adecuado");
    }

    @Test
    void getArea() {
        Circle e = new Circle (4d);

        assertEquals(4*4*Math.PI,e.getArea(), "No ha devuleto el area adecuado" );
    }

    @Test
    void getColor() {
        Circle e = new Circle();
        assertEquals("red", e.getColor());
    }

    @Test
    void setRadius() {
        double newRadius = 3.4d;
        Circle d = new Circle();

        assertDoesNotThrow(() -> d.setRadius(newRadius));

        assertEquals(newRadius,d.getRadius(), "Los radios no son iguales");

    }

    @Test
    void setColor() {
        String newColor = "red";
        Circle e = new Circle();

        assertDoesNotThrow(() -> e.setColor(newColor));

        assertEquals(newColor,e.getColor(),"Los colores no son iguales");






    }

    @Test
    void testToString() {
        String color = "red";
        double radius = 4.3d;
        Circle f = new Circle();

        f.setRadius(radius);
        f.setColor(color);
        String salidaEsperada = "es.uah.matcomp.mp.e1.ejerciciosclase.hoja1.Circle[radius=4.3 color=red]";
        assertEquals(salidaEsperada,f.toString(),"No sale el mismo texto en toString()");
    }
}